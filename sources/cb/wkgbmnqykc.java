package cb;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc implements bb.iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Logger f19495iobyxmoadg = Logger.getLogger(wkgbmnqykc.class.getName());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final wkgbmnqykc f19496zoijcleaow = new wkgbmnqykc();

    private static class zoijcleaow implements bb.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final bb.jyumaefscl f19497iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lb.zoijcleaow.iobyxmoadg f19498ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lb.zoijcleaow.iobyxmoadg f19499zoijcleaow;

        @Override // bb.iobyxmoadg
        public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrIobyxmoadg = ob.gxszxtbevo.iobyxmoadg(this.f19497iobyxmoadg.eablkybsjg().zoijcleaow(), ((bb.iobyxmoadg) this.f19497iobyxmoadg.eablkybsjg().lqeggnwhkg()).iobyxmoadg(bArr, bArr2));
                this.f19499zoijcleaow.iobyxmoadg(this.f19497iobyxmoadg.eablkybsjg().wkgbmnqykc(), bArr.length);
                return bArrIobyxmoadg;
            } catch (GeneralSecurityException e13) {
                this.f19499zoijcleaow.zoijcleaow();
                throw e13;
            }
        }

        @Override // bb.iobyxmoadg
        public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (bb.jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar : this.f19497iobyxmoadg.gxszxtbevo(bArrCopyOf)) {
                    try {
                        byte[] bArrZoijcleaow = ((bb.iobyxmoadg) ppxfxbqfkfVar.lqeggnwhkg()).zoijcleaow(bArrCopyOfRange, bArr2);
                        this.f19498ppxfxbqfkf.iobyxmoadg(ppxfxbqfkfVar.wkgbmnqykc(), bArrCopyOfRange.length);
                        return bArrZoijcleaow;
                    } catch (GeneralSecurityException e13) {
                        wkgbmnqykc.f19495iobyxmoadg.info("ciphertext prefix matches a key, but cannot decrypt: " + e13);
                    }
                }
            }
            for (bb.jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar2 : this.f19497iobyxmoadg.nufgyqmvbu()) {
                try {
                    byte[] bArrZoijcleaow2 = ((bb.iobyxmoadg) ppxfxbqfkfVar2.lqeggnwhkg()).zoijcleaow(bArr, bArr2);
                    this.f19498ppxfxbqfkf.iobyxmoadg(ppxfxbqfkfVar2.wkgbmnqykc(), bArr.length);
                    return bArrZoijcleaow2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f19498ppxfxbqfkf.zoijcleaow();
            throw new GeneralSecurityException("decryption failed");
        }

        private zoijcleaow(bb.jyumaefscl jyumaefsclVar) {
            this.f19497iobyxmoadg = jyumaefsclVar;
            if (!jyumaefsclVar.dxjokdxxww()) {
                lb.zoijcleaow.iobyxmoadg iobyxmoadgVar = com.google.crypto.tink.internal.gxszxtbevo.f23837iobyxmoadg;
                this.f19499zoijcleaow = iobyxmoadgVar;
                this.f19498ppxfxbqfkf = iobyxmoadgVar;
            } else {
                lb.zoijcleaow zoijcleaowVarIobyxmoadg = com.google.crypto.tink.internal.lqeggnwhkg.zoijcleaow().iobyxmoadg();
                lb.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = com.google.crypto.tink.internal.gxszxtbevo.iobyxmoadg(jyumaefsclVar);
                this.f19499zoijcleaow = zoijcleaowVarIobyxmoadg.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, "aead", "encrypt");
                this.f19498ppxfxbqfkf = zoijcleaowVarIobyxmoadg.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, "aead", "decrypt");
            }
        }
    }

    wkgbmnqykc() {
    }

    public static void eablkybsjg() {
        bb.cqumvgiudr.agtfadlqog(f19496zoijcleaow);
    }

    @Override // bb.iwizpuwonk
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public bb.iobyxmoadg iobyxmoadg(bb.jyumaefscl jyumaefsclVar) {
        return new zoijcleaow(jyumaefsclVar);
    }

    @Override // bb.iwizpuwonk
    public Class ppxfxbqfkf() {
        return bb.iobyxmoadg.class;
    }

    @Override // bb.iwizpuwonk
    public Class zoijcleaow() {
        return bb.iobyxmoadg.class;
    }
}
