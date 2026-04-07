package com.universidad.antipatrones;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcesadorPedidos procesador = new ProcesadorPedidos();
        
        // Lista de pedidos a procesar
        List<Pedido> pedidos = List.of(
            new Pedido("P001", "VIP", 1200.0, "VIPEXTRA"),
            new Pedido("P002", "VIP", 600.0, "VIP20"),
            new Pedido("P003", "PREMIUM", 300.0, "PREM10"),
            new Pedido("P004", "ESTANDAR", 150.0, "FIRST50"),
            new Pedido("P005", "ESTANDAR", 80.0, null)
        );
        
        // Procesar cada pedido
        pedidos.forEach(procesador::procesarPedido);
        
        System.out.println("\n=== Procesamiento completado ===");
    }
}
