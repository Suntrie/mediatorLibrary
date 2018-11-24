package com.repoMiner.tester;

public class MediatorDependency {

    public Integer getSquaredMagicNumber(){
        RootDependency rootDependency=new RootDependency();
        return rootDependency.getMagicNumber()*rootDependency.getMagicNumber();
    }
}
