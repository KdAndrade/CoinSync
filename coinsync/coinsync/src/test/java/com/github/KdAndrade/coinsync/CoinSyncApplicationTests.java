package com.github.KdAndrade.coinsync;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.KdAndrade.coinsync.CadastroDeUsuario.Cadastro;

@SpringBootApplication
public class CoinSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinSyncApplication.class, args);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Cadastro cadastro = new Cadastro(nome, email);

        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("Nome: " + cadastro.getNome());
        System.out.println("Email: " + cadastro.getEmail());

        sc.close();
    }
}
