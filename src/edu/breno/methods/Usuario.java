package edu.breno.methods;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada? " + smartTv.on);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.tvOn();
        System.out.println("Novo Status - Tv está ligada? " + smartTv.on);

        smartTv.tvOff();
        System.out.println("Novo status - Tv está ligada? " + smartTv.on);

        smartTv.incrementVolume();
        System.out.println("Novo status - Volume atual: " + smartTv.volume);

        smartTv.decrementVolume();
        System.out.println("Novo status - Volume atual: " + smartTv.volume);

        smartTv.incrementChannel();
        System.out.println("Mudou canal para: " + smartTv.channel);

        smartTv.decrementChannel();
        System.out.println("Mudou canal para: " + smartTv.channel);

        smartTv.changeChannel(15);
        System.out.println("Mudou canal para: " + smartTv.channel);

    }
}
