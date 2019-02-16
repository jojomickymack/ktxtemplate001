## Starter Project Template For LibKTX

[Libktx](https://libktx.github.io/) is a library which is ideal for people who want to use libgdx with kotlin. While interacting with gdx libraries 
directly with kotlin is possible, ktx provides libraries which wrap gdx and make using it more kotlin-centric and idiomatic.

Unfortunately, there aren't a lot of working examples for getting started, so hopefully others find this useful for that purpose.

It's a minimal starting point to extend kdx, you should be able to open it in android studio and begin messing around without too much fuss.

Notes  

- android studio may ask you if you want to update 'android gradle plugin', just click on 'don't remind me again for this 
project' since it can screw up the build files
- <del>if android studio fails immediately when opening the project, go into the settings and make sure that 'configure on 
demand' 
is not enabled (there's a checkbox).</del> android studio doesn't have this anymore, but if you ever see this error message 
about 'configure on demand', it's likely being set in the settings.gradle file

I went with the gradle wrapper for this project so you don't necessarily need to download gradle to your computer. I'd still 
recommend doing that though. Just download gradle 5.1 or whatever's current to your system, unzip it, and know that you can 
use the gradle settings in android studio or intellij to point to that location. Add the bin directory to your path and you'll 
be able to use gradle from the commandline and android studio should detect it automatically - when you open a new project 
you'll receive a prompt asking if you want to use the gradle wrapper, and if you decline it will allow for you to choose your 
installed version.

[https://gradle.org/release](https://gradle.org/release)

The reason for this is that by using the same version of gradle for everything, you get to have just one collection of 
downloaded jars in your $HOME/.gradle/caches directory and they will be reused from project to project.

I did a few write-ups on my blog descibing how to integrate tiled maps with your game.

[https://jojomickymack.gitlab.io/reverie/post/libgdx_kotlin](https://jojomickymack.gitlab.io/reverie/post/libgdx_kotlin)  
[https://jojomickymack.gitlab.io/reverie/post/libktx_platformer](https://jojomickymack.gitlab.io/reverie/post/libktx_platformer)  

here's one describing some how to get started with entity component systems - a concept that can help when you have a lot of game objects to manage.

[https://jojomickymack.gitlab.io/reverie/post/ashley_ecs](https://jojomickymack.gitlab.io/reverie/post/ashley_ecs)

