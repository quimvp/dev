#/bin/sh
sudo apt-get install cowsay -y
cowsay -f dragon "Run for Cover, I am a DRAGON...." >> dragon.txt
grep -i "dragon" dragon.txt
cat dragon.txt
ls -ltr