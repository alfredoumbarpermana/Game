public class software {
    
    protected String code, namagame, lisensi;
    
    
    public software (){
        
    }
   
		public software (String kode, String game, String lisen){
        
        this.code = kode;
        this.namagame = game;
        this.lisensi = lisen;        
    }
    
        public void setCode(String kode){
        this.code = kode;        
    }
    
		public String getCode(){
        return code;        
    }
    
        public void setNamagame(String game){
        this.namagame = game;        
    }
    
    public String getNamagame(){
      return namagame;        
    }
    
        public void setlisensi (String lisen){
        this.lisensi = lisen;
    }
    
    public String getlisensi(){
        return lisensi;
    }
}