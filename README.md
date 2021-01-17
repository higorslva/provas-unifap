-----Instruções-----

* 1) Você precisa ter o ADB e Fastboot no seu PC:
*  1.1) No Windows, baixe-os aqui: https://droidfilehost.com/download/download-adb-fastboot-android-sdk-platform-tools-for-windows/
        
        1.1.1) Baixe também os drivers da fabricante do seu celular (Apenas Windows)
        
        1.1.2) Configure o adb e fastboot para seu path. Instruções aqui:
    
    1.2) No MacOS, baixe-os aqui: https://droidfilehost.com/download/download-adb-fastboot-android-sdk-platform-tools-for-mac/
    
    1.3) Em Linux baseado em Debian (Ubuntu, Linux Mint, Zorin OS...), instale com um terminal:
    
        ``` $ sudo adb install adb fastboot ```
  
    1.4) Em Linux baseado em ArchLinux, instale com um terminal:
        
        ```
        $ sudo pacman -S adb fastboot
        ```
   
   1.5) Em Linux baseado em Fedora, instale com um terminal:
    
        $ sudo dnf install android-tools
        
    
2) Ligue o Moto G5 no bootloader (Botão Power + Volume pra baixo)

3) Abra o terminal (Prompt de Comando no Windows) e mude para o diretório:
    
    3.1) No Windows, com o comando:
    
        cd C:\%USERPROFILE%\Downloads (Ou a pasta em que você baixou o arquivo)
        
        fastboot flash recovery twrp-3.5.0_9-0-cedric.img
        
    3.2) No Linux e MacOS, dê o comando
    
        $ fastboot flash recovery ~/Downloads/twrp-3.5.0_9-0-cedric.img
        
        ou
        
        $ cd ~/Downloads
        
        $ fastboot flash recovery twrp-3.5.0_9-0-cedric.img
    
4) Feito :)    
    
