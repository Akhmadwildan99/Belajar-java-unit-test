package belajar.unit.tes;

import org.junit.jupiter.api.Test;

/**
 * Cara kerja method test, sedikit berbeda dengan
 * method dalam class biasa.
 * dalam class test, method yang dieksekusi otomatis
 * membuat object baru.
 * Jadi jika kita mengeksekusi method yang mngonsumsi data dari
 * hasil eksekusi method lain, data itu akan kosong kembali atau null.
 */
public class LifeSickleTest {
    private String name;
    @Test
    void test1(){
        name = "wildan";
    }

    @Test
    void test2(){
        System.out.println(name);
    }
}
