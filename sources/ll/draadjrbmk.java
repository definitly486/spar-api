package ll;

import java.security.Key;
import org.jose4j.lang.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public class draadjrbmk extends kl.gxszxtbevo implements yggfygwlhe {
    public draadjrbmk() {
        wflxmlrfwp("dir");
        ojitshcjhn(ql.kcexrzcfyt.SYMMETRIC);
        rgvfuqvkyq("oct");
    }

    private void vdvldrhtss(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        int length;
        int iZoijcleaow;
        pl.wkgbmnqykc.wkgbmnqykc(key);
        if (key.getEncoded() == null || (iZoijcleaow = lqeggnwhkgVar.wkgbmnqykc().zoijcleaow()) == (length = key.getEncoded().length)) {
            return;
        }
        throw new InvalidKeyException("Invalid key for " + eablkybsjg() + " with " + lqeggnwhkgVar.eablkybsjg() + ", expected a " + rl.iobyxmoadg.iobyxmoadg(iZoijcleaow) + " bit key but a " + rl.iobyxmoadg.iobyxmoadg(length) + " bit key was provided.");
    }

    @Override // kl.iobyxmoadg
    public boolean btonecajqb() {
        return true;
    }

    @Override // ll.yggfygwlhe
    public void gxszxtbevo(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        vdvldrhtss(key, lqeggnwhkgVar);
    }

    @Override // ll.yggfygwlhe
    public Key lqeggnwhkg(kl.lqeggnwhkg lqeggnwhkgVar, byte[] bArr, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) throws InvalidKeyException {
        Key keyZoijcleaow = lqeggnwhkgVar.zoijcleaow();
        if (bArr.length == 0) {
            return keyZoijcleaow;
        }
        throw new InvalidKeyException("An empty octet sequence is to be used as the JWE Encrypted Key value when utilizing direct encryption but this JWE has " + bArr.length + " octets in the encrypted key part.");
    }

    @Override // ll.yggfygwlhe
    public void nufgyqmvbu(Key key, lqeggnwhkg lqeggnwhkgVar) throws InvalidKeyException {
        vdvldrhtss(key, lqeggnwhkgVar);
    }

    @Override // ll.yggfygwlhe
    public kl.lqeggnwhkg ppxfxbqfkf(Key key, pl.zoijcleaow zoijcleaowVar, gl.iobyxmoadg iobyxmoadgVar) {
        return new kl.lqeggnwhkg(key);
    }

    @Override // ll.yggfygwlhe
    public btonecajqb zoijcleaow(Key key, dxjokdxxww dxjokdxxwwVar, pl.zoijcleaow zoijcleaowVar, byte[] bArr, gl.iobyxmoadg iobyxmoadgVar) throws InvalidKeyException {
        pl.wkgbmnqykc.zoijcleaow(bArr, eablkybsjg());
        return new btonecajqb(key.getEncoded(), rl.iobyxmoadg.f83021iobyxmoadg);
    }
}
