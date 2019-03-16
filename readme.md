## Starter Project Template For LibKTX

[Libktx](https://libktx.github.io/) is a library which is ideal for people who want to use libgdx with kotlin. While interacting with gdx libraries 
directly with kotlin is possible, ktx provides libraries which wrap gdx and make using it more kotlin-centric and idiomatic.

Before you can start getting into the code, however, you need to get your dependencies set up, make sure the ide is happy, try to figure out 
why gradle is running into errors... well - that's what this project is for - to hopfully give you a starting place where you don't have to 
edit all the build files.

It's a minimal starting point to extend kdx, you should be able to open it in android studio and begin messing around without too much fuss.

![template.gif](.github/template.gif?raw=true)

I use this project as a starter for a new project and I also like to replace 'core/src' with the source code from another project. You might 
only need to change the desktop/src/com/central/DesktopLauncher.kt file so it starts the main application class of whatever project you 
dropped in there.

Notes  

- android studio may ask you if you want to update 'android gradle plugin', just click on 'don't remind me again for this 
project' since it can screw up the build files

- if you run into build problems, remember you can close Android Studio and delete the .idea, build directories, gradle, and all the .iml 
files - then open the project again in Android Studio and all those files will be recreated new

I used the gradle wrapper for this project so you don't necessarily need to download gradle to your computer - you probably will want to do 
that eventually though - all you need to do is download the binary only gradle version you want (this project uses gradle 5.1). Android 
Studio has a setting under 'build, execution, and deployment' where you can set gradle's location. You don't need the gradle 
directory, or the gradlew, gradlew.bat files when you do it that way.

[https://gradle.org/release](https://gradle.org/release)

I did a few write-ups on my blog descibing how to integrate tiled maps with your game.

[https://jojomickymack.gitlab.io/reverie/post/libgdx_kotlin](https://jojomickymack.gitlab.io/reverie/post/libgdx_kotlin)  
[https://jojomickymack.gitlab.io/reverie/post/libktx_platformer](https://jojomickymack.gitlab.io/reverie/post/libktx_platformer)  

here's one describing some how to get started with entity component systems - a concept that can help when you have a lot of game objects to manage.

[https://jojomickymack.gitlab.io/reverie/post/ashley_ecs](https://jojomickymack.gitlab.io/reverie/post/ashley_ecs)

