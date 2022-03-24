/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author fco-j
 */
public enum Grupo {
    
    C(17.5),
    D(18),
    E(18.5);
    
    final private double IRPF;

    private Grupo(double IRPF) {
        
        this.IRPF = IRPF;
        
    }    
    
    public double getIRPF() {
        
        return IRPF;
        
    }

    @Override
    public String toString() {
        
        return "IRPF del grupo: " + IRPF + '%';
        
    }
            
}
