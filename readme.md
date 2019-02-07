## Starter Project Template For LibKDX

[Libktx](https://libktx.github.io/) is a library which is ideal for people who want to use libgdx with kotlin. While interacting with gdx libraries 
directly with kotlin is possible, ktx provides libraries which wrap gdx and make using it more kotlin-centric and idiomatic.

Unfortunately, there aren't a lot of working examples for getting started, so hopefully others find this useful for that purpose.

It's a minimal starting point to extend kdx, you should be able to open it in android studio and begin messing around without too much fuss.

Notes  

- this was developed using gradle 5.1 - lower versions of gradle or the gradle wrapper may have issues.  
- if intellij fails immediately when opening the project, go into the settings and make sure that 'configure on demand' is not 
enabled (there's a checkbox).  
- intellij screws up when attempting to run 'DesktopLauncher' by right clicking - you need to run the ':desktop:application:run' task  

I did a few write-ups on my blog descibing how to integrate tiled maps with your game.

[https://jojomickymack.gitlab.io/reverie/post/libgdx_kotlin](https://jojomickymack.gitlab.io/reverie/post/libgdx_kotlin)  
[https://jojomickymack.gitlab.io/reverie/post/libktx_platformer](https://jojomickymack.gitlab.io/reverie/post/libktx_platformer)  

here's one describing some how to get started with entity component systems - a concept that can help when you have a lot of game objects to manage.

[https://jojomickymack.gitlab.io/reverie/post/ashley_ecs](https://jojomickymack.gitlab.io/reverie/post/ashley_ecs)

