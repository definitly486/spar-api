package jb;

import bb.cqumvgiudr;
import bb.iwizpuwonk;
import bb.jyumaefscl;
import bb.zdlpuopuiu;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
class oxmwwwfdhm implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Logger f51004iobyxmoadg = Logger.getLogger(oxmwwwfdhm.class.getName());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final byte[] f51006zoijcleaow = {0};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final oxmwwwfdhm f51005ppxfxbqfkf = new oxmwwwfdhm();

    private static class zoijcleaow implements zdlpuopuiu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jyumaefscl f51007iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final lb.zoijcleaow.iobyxmoadg f51008ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lb.zoijcleaow.iobyxmoadg f51009zoijcleaow;

        @Override // bb.zdlpuopuiu
        public void iobyxmoadg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f51008ppxfxbqfkf.zoijcleaow();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar : this.f51007iobyxmoadg.gxszxtbevo(bArrCopyOf)) {
                byte[] bArrIobyxmoadg = ppxfxbqfkfVar.gxszxtbevo().equals(ylkuphrtab.LEGACY) ? ob.gxszxtbevo.iobyxmoadg(bArr2, oxmwwwfdhm.f51006zoijcleaow) : bArr2;
                try {
                    ((zdlpuopuiu) ppxfxbqfkfVar.lqeggnwhkg()).iobyxmoadg(bArrCopyOfRange, bArrIobyxmoadg);
                    this.f51008ppxfxbqfkf.iobyxmoadg(ppxfxbqfkfVar.wkgbmnqykc(), bArrIobyxmoadg.length);
                    return;
                } catch (GeneralSecurityException e13) {
                    oxmwwwfdhm.f51004iobyxmoadg.info("tag prefix matches a key, but cannot verify: " + e13);
                }
            }
            for (jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar2 : this.f51007iobyxmoadg.nufgyqmvbu()) {
                try {
                    ((zdlpuopuiu) ppxfxbqfkfVar2.lqeggnwhkg()).iobyxmoadg(bArr, bArr2);
                    this.f51008ppxfxbqfkf.iobyxmoadg(ppxfxbqfkfVar2.wkgbmnqykc(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f51008ppxfxbqfkf.zoijcleaow();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // bb.zdlpuopuiu
        public byte[] zoijcleaow(byte[] bArr) throws GeneralSecurityException {
            if (this.f51007iobyxmoadg.eablkybsjg().gxszxtbevo().equals(ylkuphrtab.LEGACY)) {
                bArr = ob.gxszxtbevo.iobyxmoadg(bArr, oxmwwwfdhm.f51006zoijcleaow);
            }
            try {
                byte[] bArrIobyxmoadg = ob.gxszxtbevo.iobyxmoadg(this.f51007iobyxmoadg.eablkybsjg().zoijcleaow(), ((zdlpuopuiu) this.f51007iobyxmoadg.eablkybsjg().lqeggnwhkg()).zoijcleaow(bArr));
                this.f51009zoijcleaow.iobyxmoadg(this.f51007iobyxmoadg.eablkybsjg().wkgbmnqykc(), bArr.length);
                return bArrIobyxmoadg;
            } catch (GeneralSecurityException e13) {
                this.f51009zoijcleaow.zoijcleaow();
                throw e13;
            }
        }

        private zoijcleaow(jyumaefscl jyumaefsclVar) {
            this.f51007iobyxmoadg = jyumaefsclVar;
            if (!jyumaefsclVar.dxjokdxxww()) {
                lb.zoijcleaow.iobyxmoadg iobyxmoadgVar = com.google.crypto.tink.internal.gxszxtbevo.f23837iobyxmoadg;
                this.f51009zoijcleaow = iobyxmoadgVar;
                this.f51008ppxfxbqfkf = iobyxmoadgVar;
            } else {
                lb.zoijcleaow zoijcleaowVarIobyxmoadg = com.google.crypto.tink.internal.lqeggnwhkg.zoijcleaow().iobyxmoadg();
                lb.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = com.google.crypto.tink.internal.gxszxtbevo.iobyxmoadg(jyumaefsclVar);
                this.f51009zoijcleaow = zoijcleaowVarIobyxmoadg.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, "mac", "compute");
                this.f51008ppxfxbqfkf = zoijcleaowVarIobyxmoadg.iobyxmoadg(ppxfxbqfkfVarIobyxmoadg, "mac", "verify");
            }
        }
    }

    oxmwwwfdhm() {
    }

    public static void gxszxtbevo() {
        cqumvgiudr.agtfadlqog(f51005ppxfxbqfkf);
    }

    private void lqeggnwhkg(jyumaefscl jyumaefsclVar) throws GeneralSecurityException {
        Iterator it = jyumaefsclVar.ppxfxbqfkf().iterator();
        while (it.hasNext()) {
            for (jyumaefscl.ppxfxbqfkf ppxfxbqfkfVar : (List) it.next()) {
                if (ppxfxbqfkfVar.ppxfxbqfkf() instanceof rgvfuqvkyq) {
                    rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) ppxfxbqfkfVar.ppxfxbqfkf();
                    pb.iobyxmoadg iobyxmoadgVarIobyxmoadg = pb.iobyxmoadg.iobyxmoadg(ppxfxbqfkfVar.zoijcleaow());
                    if (!iobyxmoadgVarIobyxmoadg.equals(rgvfuqvkyqVar.iobyxmoadg())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + rgvfuqvkyqVar.zoijcleaow() + " has wrong output prefix (" + rgvfuqvkyqVar.iobyxmoadg() + ") instead of (" + iobyxmoadgVarIobyxmoadg + ")");
                    }
                }
            }
        }
    }

    @Override // bb.iwizpuwonk
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public zdlpuopuiu iobyxmoadg(jyumaefscl jyumaefsclVar) throws GeneralSecurityException {
        lqeggnwhkg(jyumaefsclVar);
        return new zoijcleaow(jyumaefsclVar);
    }

    @Override // bb.iwizpuwonk
    public Class ppxfxbqfkf() {
        return zdlpuopuiu.class;
    }

    @Override // bb.iwizpuwonk
    public Class zoijcleaow() {
        return zdlpuopuiu.class;
    }
}
