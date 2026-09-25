NALLGAME - BUILD APK DARI HP

Project ini adalah aplikasi Android debug sederhana untuk game milik sendiri.
Bukan cheat/mod untuk game pihak ketiga.

CARA BUILD DENGAN GITHUB ACTIONS:
1. Buat akun/login di GitHub.
2. Buat repository baru, misalnya: NallGame
3. Ekstrak ZIP ini di HP.
4. Upload semua isi folder ke repository GitHub.
   Pastikan file .github/workflows/android-build.yml ikut ter-upload.
5. Buka tab Actions di repository.
6. Pilih "Build NallGame APK".
7. Tekan "Run workflow" jika workflow belum otomatis berjalan.
8. Tunggu sampai selesai.
9. Buka hasil workflow yang selesai.
10. Di bagian Artifacts, download "NallGame-debug".
11. Ekstrak artifact ZIP dan install app-debug.apk di HP.

CATATAN:
- Tidak perlu menjalankan Gradle di Termux.
- Build dilakukan di server GitHub Actions sehingga HP tidak bekerja berat.
- Jika Android menolak instalasi, izinkan pemasangan aplikasi dari sumber yang digunakan browser/file manager.
