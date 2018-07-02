# common-library
Library containing common files useful to all projects

# Usage

In module level gradle file :-

1. Add repository in 'android'
repositories {
        flatDir {
            dirs '../../CommonLibs/commonlib/build/outputs/aar'
        }
}

-------------------------------

2. Add dependency
implementation(name:'commonlib-debug', ext:'aar')

-------------------------------

NB:- CommonLibs project should be in the same directory as other projects to be used in them.
