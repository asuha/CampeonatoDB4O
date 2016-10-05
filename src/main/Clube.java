package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Clube implements Serializable {

	private static final long serialVersionUID = 1L;
    private String nome;
    private ArrayList<Patrocinador> patrocinadores;
    private ArrayList<Diretor> diretores;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<TorcidaOrganizada> torcidasOrganizadas;
    private ClassificacaoGeral classificacaoGeral;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogador3;
    private Jogador jogador4;
    private Jogador jogador5;
    private Jogador jogador6;
    private Jogador jogador7;
    private Jogador jogador8;
    private Jogador jogador9;
    private Jogador jogador10;
    private Jogador jogador11;
    private Jogador jogador12;
    private Jogador jogador13;
    private Jogador jogador14;
    private Jogador jogador15;
    private Jogador jogador16;

    public Clube(ArrayList<Patrocinador> patrocinadores, ArrayList<Diretor> diretores, ArrayList<Tecnico> tecnicos,
                 ArrayList<TorcidaOrganizada> torcidasOrganizadas){
        this.patrocinadores = patrocinadores;
        this.diretores = diretores;
        this.tecnicos = tecnicos;
        this.torcidasOrganizadas = torcidasOrganizadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(ArrayList<Patrocinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public ArrayList<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(ArrayList<Diretor> diretores) {
        this.diretores = diretores;
    }

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public ArrayList<TorcidaOrganizada> getTorcidasOrganizadas() {
        return torcidasOrganizadas;
    }

    public void setTorcidasOrganizadas(ArrayList<TorcidaOrganizada> torcidasOrganizadas) {
        this.torcidasOrganizadas = torcidasOrganizadas;
    }

    public ClassificacaoGeral getClassificacaoGeral() {
        return classificacaoGeral;
    }

    public void setClassificacaoGeral(ClassificacaoGeral classificacaoGeral) {
        this.classificacaoGeral = classificacaoGeral;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Jogador getJogador3() {
        return jogador3;
    }

    public void setJogador3(Jogador jogador3) {
        this.jogador3 = jogador3;
    }

    public Jogador getJogador4() {
        return jogador4;
    }

    public void setJogador4(Jogador jogador4) {
        this.jogador4 = jogador4;
    }

    public Jogador getJogador5() {
        return jogador5;
    }

    public void setJogador5(Jogador jogador5) {
        this.jogador5 = jogador5;
    }

    public Jogador getJogador6() {
        return jogador6;
    }

    public void setJogador6(Jogador jogador6) {
        this.jogador6 = jogador6;
    }

    public Jogador getJogador7() {
        return jogador7;
    }

    public void setJogador7(Jogador jogador7) {
        this.jogador7 = jogador7;
    }

    public Jogador getJogador8() {
        return jogador8;
    }

    public void setJogador8(Jogador jogador8) {
        this.jogador8 = jogador8;
    }

    public Jogador getJogador9() {
        return jogador9;
    }

    public void setJogador9(Jogador jogador9) {
        this.jogador9 = jogador9;
    }

    public Jogador getJogador10() {
        return jogador10;
    }

    public void setJogador10(Jogador jogador10) {
        this.jogador10 = jogador10;
    }

    public Jogador getJogador11() {
        return jogador11;
    }

    public void setJogador11(Jogador jogador11) {
        this.jogador11 = jogador11;
    }

    public Jogador getJogador12() {
        return jogador12;
    }

    public void setJogador12(Jogador jogador12) {
        this.jogador12 = jogador12;
    }

    public Jogador getJogador13() {
        return jogador13;
    }

    public void setJogador13(Jogador jogador13) {
        this.jogador13 = jogador13;
    }

    public Jogador getJogador14() {
        return jogador14;
    }

    public void setJogador14(Jogador jogador14) {
        this.jogador14 = jogador14;
    }

    public Jogador getJogador15() {
        return jogador15;
    }

    public void setJogador15(Jogador jogador15) {
        this.jogador15 = jogador15;
    }

    public Jogador getJogador16() {
        return jogador16;
    }

    public void setJogador16(Jogador jogador16) {
        this.jogador16 = jogador16;
    }

}
