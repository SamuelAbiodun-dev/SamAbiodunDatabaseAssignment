package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {
@BeforeEach
    public void setUp(){
}
@Test
    public void encrypt(){
    int encryptedCode = Cryptography.encrypt(1452);
    assertEquals(2981, encryptedCode);
}
@Test
    public void decrypt(){
        int decryptedCode = Cryptography.decrypt(2981);
        assertEquals(1452, decryptedCode);
    }
}