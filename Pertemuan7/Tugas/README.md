## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Kesimpulan Cara Kerja Polimorfisme
Polimorfisme adalah kemampuan objek merespons method yang sama dengan cara berbeda sesuai tipe aslinya.

Di program ini, Civitasakademika menjadi parent class dari Dosen dan Mahasiswa. Keduanya memiliki method getNomor(), tetapi hasilnya berbeda:
- Dosen mengembalikan NIP
- Mahasiswa mengembalikan NIM

Saat objek Dosen atau Mahasiswa disimpan dalam array bertipe Civitasakademika, Java akan otomatis menjalankan method sesuai jenis objek aslinya.

ex:
pesertas[i].getNomor();

Jika isi array adalah Dosen, maka yang dipanggil adalah getNomor() milik Dosen. Jika isinya Mahasiswa, maka yang dijalankan adalah milik Mahasiswa.

Polimorfisme membuat program menjadi lebih rapi, fleksibel, dan mudah dikembangkan.