public class game extends software{
   
    protected String jenis;
    protected String type;
    
	
    public game (String kode, String name, String lisen){
        super(kode, name, lisen);
    }
    
    
    public game(String jns, String tipe){
        this.jenis = jns;
        this.type = tipe;
        super.setCode(code);
        super.setNamagame(namagame);
        super.setlisensi(lisensi);        
    }
    
    
    public String getCod(){
        return super.getCode();        
    }
    

    public String getNama(){
        return super.getNamagame();
    }
    

    public String getlis (){
        return super.getlisensi();
    }
    
    
    public String getJenis(){
        return jenis;
    }
    
    
    public String getType(){
        return type;
    }

}