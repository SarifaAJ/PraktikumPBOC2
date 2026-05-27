/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author Sarifa Nuha AJ / 24060124130082
 */
public class MysqlMahasiswaService {
    /* * ATRIBUT * */
    Connection koneksi = null;
    
    /* * METHOD * */
    // constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }
    
    /* Membuat object mahasiswa */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    /* Menambahkan data mahasiswa */
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }
    /* Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }
    /* Delete data mahasiswa sesuai id */
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }
    /* Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return mhs;
    }
    /* Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                list.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return list;
    }
    /*Reset indeks tabel mahasiswa ke 1*/
    public void indexReset(){
        try {
            Statement st = koneksi.createStatement();
            st.executeUpdate("ALTER TABLE mahasiswa AUTO_INCREMENT = 1");
            System.out.println("Index berhasil direset");
        } catch (SQLException e) {
            System.out.println("Gagal reset index: " + e.getMessage());
        }
    }
    /*Memeriksa apakah tabel kosong*/
    public boolean isEmpty(){
        boolean kosong = true;
        try {
            String query = "SELECT COUNT(*) AS jumlah FROM mahasiswa";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                kosong = rs.getInt("jumlah") == 0;
            }
        } catch (SQLException e) {
            System.out.println("Gagal cek tabel: " + e.getMessage());
        }
        return kosong;
    }
    /*Menutup koneksi ke Database*/
    public void closeConnection(){
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menutup koneksi: " + e.getMessage());
        }
    }
}
