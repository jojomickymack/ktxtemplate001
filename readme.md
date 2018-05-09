## Starter Project Template For LibKDX

[Libktx](https://libktx.github.io/) is a library which is ideal for people who want to use libgdx with kotlin. While interacting with gdx libraries 
directly with kotlin is possible, ktx provides libraries which wrap gdx and make using it more kotlin-centric and idiomatic.

Unfortunately, there aren't a lot of working examples for getting started and I couldn't find any targetting android. I basically took a gdx 'hello 
world' project generated from the 'gdx setup tool', updated it to use gradle 4.6 and build tools 3.2.1, migrated everything to kotlin, and added a 
stripped down version of [this game](https://github.com/czyzby/bialjam17).

It's a minimal starting point to extend kdx, you should be able to open it in android studio and begin playing with ktx.


Notes  

- this was developed using gradle 4.6, older versions have different syntax and won't be compatible with android build tools 3.1.2  
- gradle doesn't like a feature that's always on when opening in android studio - 'configure on demand' - you will get an error immediately when opening  
it for the first time - just go to settings in intellij, find 'compiler' under 'build, execution, and deployment' and uncheck 'configure on demand'  
- intellij screws up when attempting to run 'DesktopLauncher' by right clicking - you need to run the ':desktop:application:run' task  
- texture packing was set up in the basis project, but doesn't seem to work - when running the 'pack' task, it'supposed to assemble a texturepacker and 
atlas file - it errors out, but with some research can probably be used  

Hopefully others might have an interest in this and use it to get up and running with ktx!

