package net.msapi.transfertangaza.utils;




import net.msapi.transfertangaza.models.cmm.CmmChrono;
import net.msapi.transfertangaza.respository.cmm.CmmChronoRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class CalculChrono {
    private final CmmChronoRepository cmmChronoRepository;
    private CmmChrono chrono;

    public CalculChrono(CmmChronoRepository cmmChronoRepository) {
        this.cmmChronoRepository = cmmChronoRepository;
    }

    public String numCompose(Date date, Integer nature, String serie) {
        long numero = 0;
        String anneString = "" + (date.getYear() + 1900);
        if (serie == null || serie.isEmpty()) {
            serie = "";
        }
        this.chrono = cmmChronoRepository.findByChrSerieAndChrNatureAndChrPeriode(serie, nature, anneString).get(0);
        if (chrono != null) {
            numero = this.enregistrerNumero(date, chrono);
            return this.formattageChrono(this.chrono, numero, "", serie, date);
        } else {
            return "";
        }
    }

    public String numCompose(Date date, int nature, String typeReg, String serie) {
        long numero = 0L;
        String anneString = "" + (date.getYear() + 1900);
        if (serie == null || serie.isEmpty()) {
            serie = "";
        }
        this.chrono = cmmChronoRepository.findByChrSerieAndChrNatureAndChrPeriode(serie, nature, anneString).get(0);
        if (this.chrono == null) {
            return "";
        } else {
            numero = this.enregitrerNumero(date, typeReg);
            return this.formattageChrono(this.chrono, numero, "", typeReg, serie, date);
        }
    }

    public String numComposeCaisse(Date date, int nature, String typeReg, String serie, String caisse) {
        long numero = 0L;
        String anneString = "" + (date.getYear() + 1900);
        if (serie == null || serie.isEmpty()) {
            serie = "";
        }

        if (caisse != null && !caisse.isEmpty()) {
            this.chrono = cmmChronoRepository.findByChrCodeCaisseAndChrSerieAndChrNatureAndChrPeriode(caisse, serie, nature, anneString).orElse(null);
        } else {
            this.chrono = cmmChronoRepository.findByChrSerieAndChrNatureAndChrPeriode(serie, nature, anneString).get(0);
        }

        if (this.chrono == null) {
            return "";
        } else {
            numero = this.enregitrerNumero(date, typeReg);
            return this.formattageChrono(this.chrono, numero, "", typeReg, serie, date);
        }
    }

    private String formattageChrono(CmmChrono chrono, long numero, String s, String serie, Date date) {
        String var5 = "";
        String var6 = "";
        if (date == null) {
            date = new Date();
        }

        SimpleDateFormat var7 = new SimpleDateFormat("dd-MM-yyyy");
        String var8 = "" + var7.format(date);
        String[] var9 = var8.split("-");
        String var10 = var9[0];
        String var11 = var9[1];
        String var12 = var9[2];
        var6 = this.numero(chrono.getChrNbCar(), numero);
        if (chrono.getChrFormat() == 0) {
            var5 = var6;
        } else if (chrono.getChrFormat() == 1) {
            var5 = var11 + "" + var6;
        } else if (chrono.getChrFormat() == 2) {
            var5 = var12.subSequence(2, 4) + "" + var11 + "" + var6;
        } else if (chrono.getChrFormat() == 3) {
            var5 = var6 + "/" + var12.subSequence(2, 4);
        } else if (chrono.getChrFormat() == 4) {
            var5 = var6 + "/" + var12.subSequence(2, 4) + "" + var11;
        } else if (chrono.getChrFormat() == 5) {
            var5 = var6 + "/" + numero;
        } else if (chrono.getChrFormat() == 6) {
            var5 = var6 + "/" + var11 + "/" + numero;
        } else if (chrono.getChrFormat() == 7) {
            var5 = var12 + var11 + var10 + var6;
        } else if (chrono.getChrFormat() == 8) {
            var5 = var12.subSequence(2, 4) + "-" + var6;
        } else if (chrono.getChrFormat() == 9) {
            var5 = var6 + "/" + var11;
        } else if (chrono.getChrFormat() == 10) {
            var5 = var12.subSequence(2, 4) + var6;
        } else if (chrono.getChrFormat() == 11) {
            var5 = var6 + "/" + var11 + var10 + var12.subSequence(2, 4);
        } else if (chrono.getChrFormat() == 12) {
            var5 = var12 + var6;
        }

        if (chrono.getChrPrefixe() != null && !chrono.getChrPrefixe().isEmpty()) {
            var5 = chrono.getChrPrefixe() + "-" + var5;
        }

        if (chrono.getChrSufixe() != null && !chrono.getChrSufixe().isEmpty()) {
            var5 = var5 + "-" + chrono.getChrSufixe();
        }

        return var5;
    }

    public String formattageChrono(CmmChrono chrono, long numero, String var4, String var5, String var6, Date date) {
        String var8 = "";
        String var9 = "";
        if (date == null) {
            date = new Date();
        }

        SimpleDateFormat var10 = new SimpleDateFormat("dd-MM-yyyy");
        String var11 = "" + var10.format(date);
        String[] var12 = var11.split("-");
        String var13 = var12[0];
        String var14 = var12[1];
        String var15 = var12[2];
        var9 = this.numero(chrono.getChrNbCar(), numero);
        if (chrono.getChrFormat() == 0) {
            var8 = var9;
        } else if (chrono.getChrFormat() == 1) {
            var8 = var14 + "" + var9;
        } else if (chrono.getChrFormat() == 2) {
            var8 = var15.subSequence(2, 4) + "" + var14 + "" + var9;
        } else if (chrono.getChrFormat() == 3) {
            var8 = var9 + "/" + var15.subSequence(2, 4);
        } else if (chrono.getChrFormat() == 4) {
            var8 = var9 + "/" + var15.subSequence(2, 4) + "" + var14;
        } else if (chrono.getChrFormat() == 5) {
            var8 = var9 + "/" + var4;
        } else if (chrono.getChrFormat() == 6) {
            var8 = var9 + "/" + var14 + "/" + var4;
        } else if (chrono.getChrFormat() == 7) {
            var8 = var15 + var14 + var13 + var9;
        } else if (chrono.getChrFormat() == 8) {
            var8 = var15.subSequence(2, 4) + "-" + var9;
        } else if (chrono.getChrFormat() == 9) {
            var8 = var9 + "/" + var14;
        } else if (chrono.getChrFormat() == 10) {
            var8 = var15.subSequence(2, 4) + var9;
        } else if (chrono.getChrFormat() == 11) {
            var8 = var9 + "/" + var14 + var13 + var15.subSequence(2, 4);
        } else if (chrono.getChrFormat() == 12) {
            var8 = var15 + var9;
        }

        if (var5.equals("1")) {
            if (chrono.getChrPrefixe1() != null && !chrono.getChrPrefixe1().isEmpty()) {
                var8 = chrono.getChrPrefixe1() + "-" + var8;
            }

            if (chrono.getChrSufixe1() != null && !chrono.getChrSufixe1().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe1();
            }
        } else if (var5.equals("2")) {
            if (chrono.getChrPrefixe2() != null && !chrono.getChrPrefixe2().isEmpty()) {
                var8 = chrono.getChrPrefixe2() + "-" + var8;
            }

            if (chrono.getChrSufixe2() != null && !chrono.getChrSufixe2().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe2();
            }
        } else if (var5.equals("3")) {
            if (chrono.getChrPrefixe3() != null && !chrono.getChrPrefixe3().isEmpty()) {
                var8 = chrono.getChrPrefixe3() + "-" + var8;
            }

            if (chrono.getChrSufixe3() != null && !chrono.getChrSufixe3().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe3();
            }
        } else if (var5.equals("4")) {
            if (chrono.getChrPrefixe4() != null && !chrono.getChrPrefixe4().isEmpty()) {
                var8 = chrono.getChrPrefixe4() + "-" + var8;
            }

            if (chrono.getChrSufixe4() != null && !chrono.getChrSufixe4().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe4();
            }
        } else if (var5.equals("5")) {
            if (chrono.getChrPrefixe5() != null && !chrono.getChrPrefixe5().isEmpty()) {
                var8 = chrono.getChrPrefixe5() + "-" + var8;
            }

            if (chrono.getChrSufixe5() != null && !chrono.getChrSufixe5().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe5();
            }
        } else if (var5.equals("6")) {
            if (chrono.getChrPrefixe6() != null && !chrono.getChrPrefixe6().isEmpty()) {
                var8 = chrono.getChrPrefixe6() + "-" + var8;
            }

            if (chrono.getChrSufixe6() != null && !chrono.getChrSufixe6().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe6();
            }
        } else if (var5.equals("7")) {
            if (chrono.getChrPrefixe7() != null && !chrono.getChrPrefixe7().isEmpty()) {
                var8 = chrono.getChrPrefixe7() + "-" + var8;
            }

            if (chrono.getChrSufixe7() != null && !chrono.getChrSufixe7().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe7();
            }
        } else if (var5.equals("8")) {
            if (chrono.getChrPrefixe8() != null && !chrono.getChrPrefixe8().isEmpty()) {
                var8 = chrono.getChrPrefixe8() + "-" + var8;
            }

            if (chrono.getChrSufixe8() != null && !chrono.getChrSufixe8().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe8();
            }
        } else if (var5.equals("9")) {
            if (chrono.getChrPrefixe9() != null && !chrono.getChrPrefixe9().isEmpty()) {
                var8 = chrono.getChrPrefixe9() + "-" + var8;
            }

            if (chrono.getChrSufixe9() != null && !chrono.getChrSufixe9().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe9();
            }
        } else if (var5.equals("10")) {
            if (chrono.getChrPrefixeA() != null && !chrono.getChrPrefixeA().isEmpty()) {
                var8 = chrono.getChrPrefixeA() + "-" + var8;
            }

            if (chrono.getChrSufixeA() != null && !chrono.getChrSufixeA().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixeA();
            }
        } else {
            if (chrono.getChrPrefixe() != null && !chrono.getChrPrefixe().isEmpty()) {
                var8 = chrono.getChrPrefixe() + "-" + var8;
            }

            if (chrono.getChrSufixe() != null && !chrono.getChrSufixe().isEmpty()) {
                var8 = var8 + "-" + chrono.getChrSufixe();
            }
        }

        return var8;
    }

    private String numero(Integer chrNbCar, long chrNum) {
        String numero = "" + chrNum;
        int nbrCarObject = numero.length();
        int carAjout = chrNbCar - nbrCarObject;
        String nbrZero = IntStream.range(0, carAjout).mapToObj(i -> "0").collect(Collectors.joining("")).concat(numero);
        return nbrZero;
    }

    private long enregistrerNumero(Date date, CmmChrono chrono) {
        long numero = 0;
        if (chrono.getChrMode() == 0) {
            chrono.setChrNumAn(chrono.getChrNumAn() + 1);
            numero = chrono.getChrNumAn();
        } else if (chrono.getChrMode() == 1) {
            String num_var = "";
            if (date.getMonth() + 1 <= 9) {
                num_var = "0" + (date.getYear() + 1);
            } else {
                num_var = "" + (date.getYear() + 1);
            }

            if (num_var.equalsIgnoreCase("01")) {
                this.chrono.setChrNum01(this.chrono.getChrNum01() + 1L);
                numero = this.chrono.getChrNum01();
            } else if (num_var.equalsIgnoreCase("02")) {
                this.chrono.setChrNum02(this.chrono.getChrNum02() + 1L);
                numero = this.chrono.getChrNum02();
            } else if (num_var.equalsIgnoreCase("03")) {
                this.chrono.setChrNum03(this.chrono.getChrNum03() + 1L);
                numero = this.chrono.getChrNum03();
            } else if (num_var.equalsIgnoreCase("04")) {
                this.chrono.setChrNum04(this.chrono.getChrNum04() + 1L);
                numero = this.chrono.getChrNum04();
            } else if (num_var.equalsIgnoreCase("05")) {
                this.chrono.setChrNum05(this.chrono.getChrNum05() + 1L);
                numero = this.chrono.getChrNum05();
            } else if (num_var.equalsIgnoreCase("06")) {
                this.chrono.setChrNum06(this.chrono.getChrNum06() + 1L);
                numero = this.chrono.getChrNum06();
            } else if (num_var.equalsIgnoreCase("07")) {
                this.chrono.setChrNum07(this.chrono.getChrNum07() + 1L);
                numero = this.chrono.getChrNum07();
            } else if (num_var.equalsIgnoreCase("08")) {
                this.chrono.setChrNum08(this.chrono.getChrNum08() + 1L);
                numero = this.chrono.getChrNum08();
            } else if (num_var.equalsIgnoreCase("09")) {
                this.chrono.setChrNum09(this.chrono.getChrNum09() + 1L);
                numero = this.chrono.getChrNum09();
            } else if (num_var.equalsIgnoreCase("10")) {
                this.chrono.setChrNum10(this.chrono.getChrNum10() + 1L);
                numero = this.chrono.getChrNum10();
            } else if (num_var.equalsIgnoreCase("11")) {
                this.chrono.setChrNum11(this.chrono.getChrNum11() + 1L);
                numero = this.chrono.getChrNum11();
            } else if (num_var.equalsIgnoreCase("12")) {
                this.chrono.setChrNum12(this.chrono.getChrNum12() + 1L);
                numero = this.chrono.getChrNum12();
            }
        } else if (this.chrono.getChrMode() == 2) {
            this.chrono.setChrNum(this.chrono.getChrNum() + 1L);
            numero = this.chrono.getChrNum();
        }

        this.chrono = cmmChronoRepository.saveAndFlush(chrono);
        return numero;
    }

    public long enregitrerNumero(Date date, String typeReg) {
        long numero = 0L;
        String var6;
        if (typeReg.equals("1")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn1(this.chrono.getChrNumAn1() + 1L);
                numero = this.chrono.getChrNumAn1();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

                if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum011(this.chrono.getChrNum011() + 1L);
                    numero = this.chrono.getChrNum011();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum021(this.chrono.getChrNum021() + 1L);
                    numero = this.chrono.getChrNum021();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum031(this.chrono.getChrNum031() + 1L);
                    numero = this.chrono.getChrNum031();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum041(this.chrono.getChrNum041() + 1L);
                    numero = this.chrono.getChrNum041();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum051(this.chrono.getChrNum051() + 1L);
                    numero = this.chrono.getChrNum051();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum061(this.chrono.getChrNum061() + 1L);
                    numero = this.chrono.getChrNum061();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum071(this.chrono.getChrNum071() + 1L);
                    numero = this.chrono.getChrNum071();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum081(this.chrono.getChrNum081() + 1L);
                    numero = this.chrono.getChrNum081();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum091(this.chrono.getChrNum091() + 1L);
                    numero = this.chrono.getChrNum091();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum101(this.chrono.getChrNum101() + 1L);
                    numero = this.chrono.getChrNum101();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum111(this.chrono.getChrNum111() + 1L);
                    numero = this.chrono.getChrNum111();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum121(this.chrono.getChrNum121() + 1L);
                    numero = this.chrono.getChrNum121();
                }
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum1(this.chrono.getChrNum1() + 1L);
                numero = this.chrono.getChrNum1();
            }
        } else if (typeReg.equals("2")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn2(this.chrono.getChrNumAn2() + 1L);
                numero = this.chrono.getChrNumAn2();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

                if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum012(this.chrono.getChrNum012() + 1L);
                    numero = this.chrono.getChrNum012();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum022(this.chrono.getChrNum022() + 1L);
                    numero = this.chrono.getChrNum022();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum032(this.chrono.getChrNum032() + 1L);
                    numero = this.chrono.getChrNum032();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum042(this.chrono.getChrNum042() + 1L);
                    numero = this.chrono.getChrNum042();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum052(this.chrono.getChrNum052() + 1L);
                    numero = this.chrono.getChrNum052();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum062(this.chrono.getChrNum062() + 1L);
                    numero = this.chrono.getChrNum062();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum072(this.chrono.getChrNum072() + 1L);
                    numero = this.chrono.getChrNum072();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum082(this.chrono.getChrNum082() + 1L);
                    numero = this.chrono.getChrNum082();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum092(this.chrono.getChrNum092() + 1L);
                    numero = this.chrono.getChrNum092();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum102(this.chrono.getChrNum102() + 1L);
                    numero = this.chrono.getChrNum102();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum112(this.chrono.getChrNum112() + 1L);
                    numero = this.chrono.getChrNum112();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum122(this.chrono.getChrNum122() + 1L);
                    numero = this.chrono.getChrNum122();
                }
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum2(this.chrono.getChrNum2() + 1L);
                numero = this.chrono.getChrNum2();
            }
        } else if (typeReg.equals("3")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn3(this.chrono.getChrNumAn3() + 1L);
                numero = this.chrono.getChrNumAn3();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

                if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum013(this.chrono.getChrNum013() + 1L);
                    numero = this.chrono.getChrNum013();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum023(this.chrono.getChrNum023() + 1L);
                    numero = this.chrono.getChrNum023();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum033(this.chrono.getChrNum033() + 1L);
                    numero = this.chrono.getChrNum033();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum043(this.chrono.getChrNum043() + 1L);
                    numero = this.chrono.getChrNum043();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum053(this.chrono.getChrNum053() + 1L);
                    numero = this.chrono.getChrNum053();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum063(this.chrono.getChrNum063() + 1L);
                    numero = this.chrono.getChrNum063();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum073(this.chrono.getChrNum073() + 1L);
                    numero = this.chrono.getChrNum073();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum083(this.chrono.getChrNum083() + 1L);
                    numero = this.chrono.getChrNum083();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum093(this.chrono.getChrNum093() + 1L);
                    numero = this.chrono.getChrNum093();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum103(this.chrono.getChrNum103() + 1L);
                    numero = this.chrono.getChrNum103();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum113(this.chrono.getChrNum113() + 1L);
                    numero = this.chrono.getChrNum113();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum123(this.chrono.getChrNum123() + 1L);
                    numero = this.chrono.getChrNum123();
                }
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum3(this.chrono.getChrNum3() + 1L);
                numero = this.chrono.getChrNum3();
            }
        } else if (typeReg.equals("4")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn4(this.chrono.getChrNumAn4() + 1L);
                numero = this.chrono.getChrNumAn4();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

                if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum014(this.chrono.getChrNum014() + 1L);
                    numero = this.chrono.getChrNum014();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum024(this.chrono.getChrNum024() + 1L);
                    numero = this.chrono.getChrNum024();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum034(this.chrono.getChrNum034() + 1L);
                    numero = this.chrono.getChrNum034();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum044(this.chrono.getChrNum044() + 1L);
                    numero = this.chrono.getChrNum044();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum054(this.chrono.getChrNum054() + 1L);
                    numero = this.chrono.getChrNum054();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum064(this.chrono.getChrNum064() + 1L);
                    numero = this.chrono.getChrNum064();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum074(this.chrono.getChrNum074() + 1L);
                    numero = this.chrono.getChrNum074();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum084(this.chrono.getChrNum084() + 1L);
                    numero = this.chrono.getChrNum084();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum094(this.chrono.getChrNum094() + 1L);
                    numero = this.chrono.getChrNum094();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum104(this.chrono.getChrNum104() + 1L);
                    numero = this.chrono.getChrNum104();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum114(this.chrono.getChrNum114() + 1L);
                    numero = this.chrono.getChrNum114();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum124(this.chrono.getChrNum124() + 1L);
                    numero = this.chrono.getChrNum124();
                }
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum4(this.chrono.getChrNum4() + 1L);
                numero = this.chrono.getChrNum4();
            }
        } else if (typeReg.equals("5")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn5(this.chrono.getChrNumAn5() + 1L);
                numero = this.chrono.getChrNumAn5();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

                if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum015(this.chrono.getChrNum015() + 1L);
                    numero = this.chrono.getChrNum015();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum025(this.chrono.getChrNum025() + 1L);
                    numero = this.chrono.getChrNum025();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum035(this.chrono.getChrNum035() + 1L);
                    numero = this.chrono.getChrNum035();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum045(this.chrono.getChrNum045() + 1L);
                    numero = this.chrono.getChrNum045();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum055(this.chrono.getChrNum055() + 1L);
                    numero = this.chrono.getChrNum055();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum065(this.chrono.getChrNum065() + 1L);
                    numero = this.chrono.getChrNum065();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum075(this.chrono.getChrNum075() + 1L);
                    numero = this.chrono.getChrNum075();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum085(this.chrono.getChrNum085() + 1L);
                    numero = this.chrono.getChrNum085();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum095(this.chrono.getChrNum095() + 1L);
                    numero = this.chrono.getChrNum095();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum105(this.chrono.getChrNum105() + 1L);
                    numero = this.chrono.getChrNum105();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum115(this.chrono.getChrNum115() + 1L);
                    numero = this.chrono.getChrNum115();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum125(this.chrono.getChrNum125() + 1L);
                    numero = this.chrono.getChrNum125();
                }
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum5(this.chrono.getChrNum5() + 1L);
                numero = this.chrono.getChrNum5();
            }
        } else if (typeReg.equals("6")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn6(this.chrono.getChrNumAn6() + 1L);
                numero = this.chrono.getChrNumAn6();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

              /*  if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum016(this.chrono.getChrNum016() + 1L);
                    numero = this.chrono.getChrNum016();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum026(this.chrono.getChrNum026() + 1L);
                    numero = this.chrono.getChrNum026();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum036(this.chrono.getChrNum036() + 1L);
                    numero = this.chrono.getChrNum036();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum046(this.chrono.getChrNum046() + 1L);
                    numero = this.chrono.getChrNum046();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum056(this.chrono.getChrNum056() + 1L);
                    numero = this.chrono.getChrNum056();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum066(this.chrono.getChrNum066() + 1L);
                    numero = this.chrono.getChrNum066();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum076(this.chrono.getChrNum076() + 1L);
                    numero = this.chrono.getChrNum076();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum086(this.chrono.getChrNum086() + 1L);
                    numero = this.chrono.getChrNum086();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum096(this.chrono.getChrNum096() + 1L);
                    numero = this.chrono.getChrNum096();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum106(this.chrono.getChrNum106() + 1L);
                    numero = this.chrono.getChrNum106();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum116(this.chrono.getChrNum116() + 1L);
                    numero = this.chrono.getChrNum116();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum126(this.chrono.getChrNum126() + 1L);
                    numero = this.chrono.getChrNum126();
                }*/
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum6(this.chrono.getChrNum6() + 1L);
                numero = this.chrono.getChrNum6();
            }
        } else if (typeReg.equals("7")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn7(this.chrono.getChrNumAn7() + 1L);
                numero = this.chrono.getChrNumAn7();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

               /* if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum017(this.chrono.getChrNum017() + 1L);
                    numero = this.chrono.getChrNum017();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum027(this.chrono.getChrNum027() + 1L);
                    numero = this.chrono.getChrNum027();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum037(this.chrono.getChrNum037() + 1L);
                    numero = this.chrono.getChrNum037();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum047(this.chrono.getChrNum047() + 1L);
                    numero = this.chrono.getChrNum047();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum057(this.chrono.getChrNum057() + 1L);
                    numero = this.chrono.getChrNum057();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum067(this.chrono.getChrNum067() + 1L);
                    numero = this.chrono.getChrNum067();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum077(this.chrono.getChrNum077() + 1L);
                    numero = this.chrono.getChrNum077();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum087(this.chrono.getChrNum087() + 1L);
                    numero = this.chrono.getChrNum087();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum097(this.chrono.getChrNum097() + 1L);
                    numero = this.chrono.getChrNum097();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum107(this.chrono.getChrNum107() + 1L);
                    numero = this.chrono.getChrNum107();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum117(this.chrono.getChrNum117() + 1L);
                    numero = this.chrono.getChrNum117();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum127(this.chrono.getChrNum127() + 1L);
                    numero = this.chrono.getChrNum127();
                }*/
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum(this.chrono.getChrNum7() + 1L);
                numero = this.chrono.getChrNum7();
            }
        } else if (typeReg.equals("8")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn8(this.chrono.getChrNumAn8() + 1L);
                numero = this.chrono.getChrNumAn8();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

               /* if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum018(this.chrono.getChrNum018() + 1L);
                    numero = this.chrono.getChrNum018();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum028(this.chrono.getChrNum028() + 1L);
                    numero = this.chrono.getChrNum028();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum038(this.chrono.getChrNum038() + 1L);
                    numero = this.chrono.getChrNum038();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum048(this.chrono.getChrNum048() + 1L);
                    numero = this.chrono.getChrNum048();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum058(this.chrono.getChrNum058() + 1L);
                    numero = this.chrono.getChrNum058();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum068(this.chrono.getChrNum068() + 1L);
                    numero = this.chrono.getChrNum068();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum078(this.chrono.getChrNum078() + 1L);
                    numero = this.chrono.getChrNum078();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum088(this.chrono.getChrNum088() + 1L);
                    numero = this.chrono.getChrNum088();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum098(this.chrono.getChrNum098() + 1L);
                    numero = this.chrono.getChrNum098();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum108(this.chrono.getChrNum108() + 1L);
                    numero = this.chrono.getChrNum108();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum118(this.chrono.getChrNum118() + 1L);
                    numero = this.chrono.getChrNum118();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum128(this.chrono.getChrNum128() + 1L);
                    numero = this.chrono.getChrNum128();
                }*/
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum8(this.chrono.getChrNum8() + 1L);
                numero = this.chrono.getChrNum8();
            }
        } else if (typeReg.equals("9")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAn9(this.chrono.getChrNumAn9() + 1L);
                numero = this.chrono.getChrNumAn9();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

                /*if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum019(this.chrono.getChrNum019() + 1L);
                    numero = this.chrono.getChrNum019();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum029(this.chrono.getChrNum029() + 1L);
                    numero = this.chrono.getChrNum029();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum039(this.chrono.getChrNum039() + 1L);
                    numero = this.chrono.getChrNum039();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum049(this.chrono.getChrNum049() + 1L);
                    numero = this.chrono.getChrNum049();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum059(this.chrono.getChrNum059() + 1L);
                    numero = this.chrono.getChrNum059();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum069(this.chrono.getChrNum069() + 1L);
                    numero = this.chrono.getChrNum069();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum079(this.chrono.getChrNum079() + 1L);
                    numero = this.chrono.getChrNum079();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum089(this.chrono.getChrNum089() + 1L);
                    numero = this.chrono.getChrNum089();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum099(this.chrono.getChrNum099() + 1L);
                    numero = this.chrono.getChrNum099();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum109(this.chrono.getChrNum109() + 1L);
                    numero = this.chrono.getChrNum109();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum119(this.chrono.getChrNum119() + 1L);
                    numero = this.chrono.getChrNum119();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum129(this.chrono.getChrNum129() + 1L);
                    numero = this.chrono.getChrNum129();
                }*/
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNum9(this.chrono.getChrNum9() + 1L);
                numero = this.chrono.getChrNum9();
            }
        } else if (typeReg.equals("10")) {
            if (this.chrono.getChrMode() == 0) {
                this.chrono.setChrNumAnA(this.chrono.getChrNumAnA() + 1L);
                numero = this.chrono.getChrNumAnA();
            } else if (this.chrono.getChrMode() == 1) {
                var6 = "";
                if (date.getMonth() + 1 <= 9) {
                    var6 = "0" + (date.getMonth() + 1);
                } else {
                    var6 = "" + (date.getMonth() + 1);
                }

               /* if (var6.equalsIgnoreCase("01")) {
                    this.chrono.setChrNum01A(this.chrono.getChrNum01A() + 1L);
                    numero = this.chrono.getChrNum01A();
                } else if (var6.equalsIgnoreCase("02")) {
                    this.chrono.setChrNum02A(this.chrono.getChrNum02A() + 1L);
                    numero = this.chrono.getChrNum02A();
                } else if (var6.equalsIgnoreCase("03")) {
                    this.chrono.setChrNum03A(this.chrono.getChrNum03A() + 1L);
                    numero = this.chrono.getChrNum03A();
                } else if (var6.equalsIgnoreCase("04")) {
                    this.chrono.setChrNum04A(this.chrono.getChrNum04A() + 1L);
                    numero = this.chrono.getChrNum04A();
                } else if (var6.equalsIgnoreCase("05")) {
                    this.chrono.setChrNum05A(this.chrono.getChrNum05A() + 1L);
                    numero = this.chrono.getChrNum05A();
                } else if (var6.equalsIgnoreCase("06")) {
                    this.chrono.setChrNum06A(this.chrono.getChrNum06A() + 1L);
                    numero = this.chrono.getChrNum06A();
                } else if (var6.equalsIgnoreCase("07")) {
                    this.chrono.setChrNum07A(this.chrono.getChrNum07A() + 1L);
                    numero = this.chrono.getChrNum07A();
                } else if (var6.equalsIgnoreCase("08")) {
                    this.chrono.setChrNum08A(this.chrono.getChrNum08A() + 1L);
                    numero = this.chrono.getChrNum08A();
                } else if (var6.equalsIgnoreCase("09")) {
                    this.chrono.setChrNum09A(this.chrono.getChrNum09A() + 1L);
                    numero = this.chrono.getChrNum09A();
                } else if (var6.equalsIgnoreCase("10")) {
                    this.chrono.setChrNum10A(this.chrono.getChrNum10A() + 1L);
                    numero = this.chrono.getChrNum10A();
                } else if (var6.equalsIgnoreCase("11")) {
                    this.chrono.setChrNum11A(this.chrono.getChrNum11A() + 1L);
                    numero = this.chrono.getChrNum11A();
                } else if (var6.equalsIgnoreCase("12")) {
                    this.chrono.setChrNum12A(this.chrono.getChrNum12A() + 1L);
                    numero = this.chrono.getChrNum12A();
                }*/
            } else if (this.chrono.getChrMode() == 2) {
                this.chrono.setChrNumA(this.chrono.getChrNumA() + 1L);
                numero = this.chrono.getChrNumA();
            }
        } else if (this.chrono.getChrMode() == 0) {
            this.chrono.setChrNumAn(this.chrono.getChrNumAn() + 1L);
            numero = this.chrono.getChrNumAn();
        } else if (this.chrono.getChrMode() == 1) {
            var6 = "";
            if (date.getMonth() + 1 <= 9) {
                var6 = "0" + (date.getMonth() + 1);
            } else {
                var6 = "" + (date.getMonth() + 1);
            }

            if (var6.equalsIgnoreCase("01")) {
                this.chrono.setChrNum01(this.chrono.getChrNum01() + 1L);
                numero = this.chrono.getChrNum01();
            } else if (var6.equalsIgnoreCase("02")) {
                this.chrono.setChrNum02(this.chrono.getChrNum02() + 1L);
                numero = this.chrono.getChrNum02();
            } else if (var6.equalsIgnoreCase("03")) {
                this.chrono.setChrNum03(this.chrono.getChrNum03() + 1L);
                numero = this.chrono.getChrNum03();
            } else if (var6.equalsIgnoreCase("04")) {
                this.chrono.setChrNum04(this.chrono.getChrNum04() + 1L);
                numero = this.chrono.getChrNum04();
            } else if (var6.equalsIgnoreCase("05")) {
                this.chrono.setChrNum05(this.chrono.getChrNum05() + 1L);
                numero = this.chrono.getChrNum05();
            } else if (var6.equalsIgnoreCase("06")) {
                this.chrono.setChrNum06(this.chrono.getChrNum06() + 1L);
                numero = this.chrono.getChrNum06();
            } else if (var6.equalsIgnoreCase("07")) {
                this.chrono.setChrNum07(this.chrono.getChrNum07() + 1L);
                numero = this.chrono.getChrNum07();
            } else if (var6.equalsIgnoreCase("08")) {
                this.chrono.setChrNum08(this.chrono.getChrNum08() + 1L);
                numero = this.chrono.getChrNum08();
            } else if (var6.equalsIgnoreCase("09")) {
                this.chrono.setChrNum09(this.chrono.getChrNum09() + 1L);
                numero = this.chrono.getChrNum09();
            } else if (var6.equalsIgnoreCase("10")) {
                this.chrono.setChrNum10(this.chrono.getChrNum10() + 1L);
                numero = this.chrono.getChrNum10();
            } else if (var6.equalsIgnoreCase("11")) {
                this.chrono.setChrNum11(this.chrono.getChrNum11() + 1L);
                numero = this.chrono.getChrNum11();
            } else if (var6.equalsIgnoreCase("12")) {
                this.chrono.setChrNum12(this.chrono.getChrNum12() + 1L);
                numero = this.chrono.getChrNum12();
            }
        } else if (this.chrono.getChrMode() == 2) {
            this.chrono.setChrNum(this.chrono.getChrNum() + 1L);
            numero = this.chrono.getChrNum();
        }

        this.chrono = cmmChronoRepository.saveAndFlush(chrono);
        return numero;
    }
}
