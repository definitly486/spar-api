package hb;

import bb.cqumvgiudr;
import bb.eablkybsjg;
import bb.iwizpuwonk;
import bb.jyumaefscl;
import com.google.crypto.tink.internal.gxszxtbevo;
import com.google.crypto.tink.internal.lqeggnwhkg;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Logger f39994iobyxmoadg = Logger.getLogger(ppxfxbqfkf.class.getName());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ppxfxbqfkf f39995zoijcleaow = new ppxfxbqfkf();

    private static class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jyumaefscl f39996iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lb.zoijcleaow.iobyxmoadg f39997ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lb.zoijcleaow.iobyxmoadg f39998zoijcleaow;

        public iobyxmoadg(jyumaefscl jyumaefsclVar) {
            this.f39996iobyxmoadg = jyumaefsclVar;
            if (!jyumaefsclVar.dxjokdxxww()) {
                lb.zoijcleaow.iobyxmoadg iobyxmoadgVar = gxszxtbevo.f23837iobyxmoadg;
                this.f39998zoijcleaow = iobyxmoadgVar;
                this.f39997ppxfxbqfkf = iobyxmoadgVar;
            } else {
                lb.zoijcleaow zoijcleaowVarIobyxmoadg = lqeggnwhkg.zoijcleaow().iobyxmoadg();
                lb.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = gxszxtbevo.iobyxmoadg(jyumaefsclVar);
                this.f39998zoijcleaow = zoijcleaowVarIobyxmoadg.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, "daead", "encrypt");
                this.f39997ppxfxbqfkf = zoijcleaowVarIobyxmoadg.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, "daead", "decrypt");
            }
        }

        @Override // bb.eablkybsjg
        public byte[] iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrIobyxmoadg = ob.gxszxtbevo.iobyxmoadg(this.f39996iobyxmoadg.eablkybsjg().zoijcleaow(), ((eablkybsjg) this.f39996iobyxmoadg.eablkybsjg().lqeggnwhkg()).iobyxmoadg(bArr, bArr2));
                this.f39998zoijcleaow.iobyxmoadg(this.f39996iobyxmoadg.eablkybsjg().wkgbmnqykc(), bArr.length);
                return bArrIobyxmoadg;
            } catch (GeneralSecurityException e13) {
                this.f39998zoijcleaow.zoijcleaow();
                throw e13;
            }
        }

        @Override // bb.eablkybsjg
        public byte[] zoijcleaow(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar : this.f39996iobyxmoadg.gxszxtbevo(bArrCopyOf)) {
                    try {
                        byte[] bArrZoijcleaow = ((eablkybsjg) ppxfxbqfkfVar.lqeggnwhkg()).zoijcleaow(bArrCopyOfRange, bArr2);
                        this.f39997ppxfxbqfkf.iobyxmoadg(ppxfxbqfkfVar.wkgbmnqykc(), bArrCopyOfRange.length);
                        return bArrZoijcleaow;
                    } catch (GeneralSecurityException e13) {
                        ppxfxbqfkf.f39994iobyxmoadg.info("ciphertext prefix matches a key, but cannot decrypt: " + e13);
                    }
                }
            }
            for (jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar2 : this.f39996iobyxmoadg.nufgyqmvbu()) {
                try {
                    byte[] bArrZoijcleaow2 = ((eablkybsjg) ppxfxbqfkfVar2.lqeggnwhkg()).zoijcleaow(bArr, bArr2);
                    this.f39997ppxfxbqfkf.iobyxmoadg(ppxfxbqfkfVar2.wkgbmnqykc(), bArr.length);
                    return bArrZoijcleaow2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f39997ppxfxbqfkf.zoijcleaow();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    ppxfxbqfkf() {
    }

    public static void eablkybsjg() {
        cqumvgiudr.agtfadlqog(f39995zoijcleaow);
    }

    @Override // bb.iwizpuwonk
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public eablkybsjg iobyxmoadg(jyumaefscl jyumaefsclVar) {
        return new iobyxmoadg(jyumaefsclVar);
    }

    @Override // bb.iwizpuwonk
    public Class ppxfxbqfkf() {
        return eablkybsjg.class;
    }

    @Override // bb.iwizpuwonk
    public Class zoijcleaow() {
        return eablkybsjg.class;
    }
}
