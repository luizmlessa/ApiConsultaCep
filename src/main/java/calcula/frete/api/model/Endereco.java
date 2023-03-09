package calcula.frete.api.model;


import lombok.*;

import java.util.Objects;
//Classe que guarda os dados vindos do ViaCep
@Getter
@Setter
@ToString
public class Endereco {


        private String cep;
        private String logradouro;
        private String complemento;
        private String bairro;
        private String localidade;
        private String uf;
        private String ibge;
        private String gia;
        private String ddd;
        private String siafi;
        private String frete;


        public Endereco() {
        }

        public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge, String gia, String ddd, String siafi) {
                this.cep = cep;
                this.logradouro = logradouro;
                this.complemento = complemento;
                this.bairro = bairro;
                this.localidade = localidade;
                this.uf = uf;
                this.ibge = ibge;
                this.gia = gia;
                this.ddd = ddd;
                this.siafi = siafi;

        }


        public String getCep() {
                return cep;
        }

        public void setCep(String cep) {
                this.cep = cep ;
        }

        public String getLogradouro() {
                return logradouro;
        }

        public void setLogradouro(String logradouro) {
                this.logradouro = logradouro;
        }

        public String getComplemento() {
                return complemento;
        }

        public void setComplemento(String complemento) {
                this.complemento = complemento;
        }

        public String getBairro() {
                return bairro;
        }

        public void setBairro(String bairro) {
                this.bairro = bairro;
        }

        public String getLocalidade() {
                return localidade;
        }

        public void setLocalidade(String localidade) {
                this.localidade = localidade;
        }

        public String getUf() {
         if (Objects.equals(uf, "MG") || Objects.equals(uf, "RJ") || Objects.equals(uf, "SP") || Objects.equals(uf, "ES")){
                this.frete = "7.85";
                return uf;
         }
         if (Objects.equals(uf, "GO") || Objects.equals(uf, "MT") || Objects.equals(uf, "MS") || Objects.equals(uf, "DF")){
                this.frete = "12.50";
                return uf;
         }
         if (Objects.equals(uf, "AL") || Objects.equals(uf, "BA") || Objects.equals(uf, "CE") || Objects.equals(uf, "MA") || Objects.equals(uf, "PB")|| Objects.equals(uf, "PI") || Objects.equals(uf, "RN") || Objects.equals(uf, "SE")){
                this.frete = "15.98";
                return uf;
         }
         if (Objects.equals(uf, "PR") || Objects.equals(uf, "SC") || Objects.equals(uf, "RS")){
                this.frete =  "17.30";
                return uf;
         }
         if (Objects.equals(uf, "AC") || Objects.equals(uf, "AP") || Objects.equals(uf, "AM") || Objects.equals(uf, "PA") || Objects.equals(uf, "RO") || Objects.equals(uf, "RR") || Objects.equals(uf, "TO")){
                this.frete = "20.83";
                return uf;
            }
        return null;
        }

        public void setUf(String uf) {
                this.uf = uf;
        }

        public String getIbge() {
                return ibge;
        }

        public void setIbge(String ibge) {
                this.ibge = ibge;
        }

        public String getGia() {
                return gia;
        }

        public void setGia(String gia) {
                this.gia = gia;
        }

        public String getDdd() {
                return ddd;
        }

        public void setDdd(String ddd) {
                this.ddd = ddd;
        }

        public String getSiafi() {
                return siafi;
        }


        public void setSiafi(String siafi) {
                this.siafi = siafi;
        }
}

