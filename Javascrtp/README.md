# What is this?

The github.dev web-based editor is a lightweight editing experience that runs entirely in your browser. You can navigate files and source code repositories from GitHub, and make and commit code changes.

There are two ways to go directly to a VS Code environment in your browser and start coding:
*diff --git a/.devcontainer/devcontainer.json b/.devcontainer/devcontainer.json new file mode 100644
index 0000000000..c00f7e4f21
--- /dev/null
+++ b/.devcontainer/devcontainer.json
@@ -0,0 +1,72 @@
+# JavaScript - Döngüler/Break/Continue/Sonsuz döngü +
+Break:Döngüyü kırıp çıkılır.
+Continue:Döngü başa döner, alt kodları çalıştırmaz. +Sonsuz Döngü: döngü koşulunun sağlanmaması
+Kaynak Kodu (index.html)
+<script>
+var i=100;
+while(i<100){
+if(i==10){
+document.write(" pass geçildi<br>");
+//Döngü pass geçildi
+//sonsuz döngüden çıkmak için inin değeri artırıldı +i++;
+continue;
+}
+if(i==500){
+document.write("500 de döngüden çıkıldı");
+break;
+}
+document.write(i+". Java Script <br>");
+i++;
+}
+</scr
+
+# Teklifleri temsil eden opsiyonlar ...,
+listelenenlerin dışında bir değeri kabul edecektir. +
+versiyon
+Yüklemek için bir Java sürümü seçin veya girin
+//"ghcr.io/devcontainers/features/java:1": {}
+
+"latest" (default)
+"none"
+"17"
+"11"
+"8"
+...
+ekSürümler
+Ek Java sürümlerini virgülle ayırarak girin.
+
+jdkDağıtım
+Bir JDK dağıtımı seçin veya girin
+
+
+"ms" (default)
+"open"
+"oracle"
+"tem"
+"amzn"
+...
+Gradle'ı kurun
+Çok dilli yazılım geliştirme için bir yapı otomasyon aracı olan Gradle'ı yükleyin +
+
+true
+false (default)
+gradleSürümü
+Bir Gradle sürümü seçin veya girin
+
+
+"latest" (default)
+"7.5.1"
+"6.9.3"
+"5.6.4"
+...
+Maven'ı kurun
+Java için bir yönetim aracı olan Maven'ı yükleyin +
+
+true
+false (default)

<!--
  Thank you for submitting a pull request!

  Please note that this template is not optional and all _ALL_ fields must be filled out, or your pull request may be rejected.

  Please do not delete this template.
  Please do remove this header to acknowledge this message.

  Please place an x, no spaces, in all [ ] that apply
-->

- [ ] This is a **bugfix**
- [ ] This is a **feature**
- [ ] This is a **code refactor**
- [ ] This is a **test update**
- [ ] This is a **docs update**
- [ ] This is a **metadata update**

### For Bugs and Features; did you add new tests?

<!-- Please note that we won't approve your changes if you don't add tests. -->

### Motivation / Use-Case

<!--
  What existing problem does the pull request solve?

  Please explain the motivation or use-case for making this change.
  If this Pull Request addresses an issue, please link to the issue.
-->

### Breaking Changes

<!--
  If this PR introduces a breaking change, please describe the impact and a
  potential migration path for existing applications.
-->

### Additional Info

* Press the . key on any repository or pull request.
* Swap `.com` with `.dev` in the URL. For example, this repo https://github.com/github/dev becomes http://github.dev/github/dev

Preview the gif below to get a quick demo of github.dev in action.

![javascript save](https://github.com/user-attachments/files/17272469/07161433_javascriptdersnotlari.pdf)

![github dev](https://user-images.githubusercontent.com/856858/130119109-4769f2d7-9027-4bc4-a38c-10f297499e8f.gif)

# Why?
It’s a quick way to edit and navigate code. It's especially useful if you want to edit multiple files at a time or take advantage of all the powerful code editing features of Visual Studio Code when making a quick change. For more information, see our [documentation-javascript](https://github.com/user-attachments/files/17272477/07161433_javascriptdersnotlari.pdf)
).
