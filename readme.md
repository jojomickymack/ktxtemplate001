## Starter Project Template For LibKDX

[Libktx](https://libktx.github.io/) is a library which is ideal for people who want to use libgdx with kotlin. While interacting with gdx libraries 
directly with kotlin is possible, ktx provides libraries which wrap gdx and make using it more kotlin-centric and idiomatic.

Unfortunately, there aren't a lot of working examples for getting started, so hopefully others find this useful for that purpose.

It's a minimal starting point to extend kdx, you should be able to open it in android studio and begin messing around without too much fuss.

Notes  

- this was developed using gradle 4.6 - I'd recommend just installing that version of gradle and not using the gradle wrapper.  
- gradle doesn't like a feature that's always on when opening in android studio - 'configure on demand' - you will get an error immediately when opening it for the first time - just go to settings in intellij, find 'compiler' under 'build, execution, and deployment' and uncheck 'configure on demand'  
- intellij screws up when attempting to run 'DesktopLauncher' by right clicking - you need to run the ':desktop:application:run' task  

I did a few write-ups on my blog descibing how to integrate tiled maps with your game.

[http://www.reverie.fun/blog/libgdx-kotlin](http://www.reverie.fun/blog/libgdx-kotlin)  
[http://www.reverie.fun/blog/libktx-platformer](http://www.reverie.fun/blog/libktx-platformer)  

