package bb;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.hkdspvbjdz;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww implements nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.crypto.tink.internal.wkgbmnqykc f15639iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Class f15640zoijcleaow;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg f15641iobyxmoadg;

        iobyxmoadg(com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            this.f15641iobyxmoadg = iobyxmoadgVar;
        }

        private hkdspvbjdz zoijcleaow(hkdspvbjdz hkdspvbjdzVar) {
            this.f15641iobyxmoadg.eablkybsjg(hkdspvbjdzVar);
            return this.f15641iobyxmoadg.iobyxmoadg(hkdspvbjdzVar);
        }

        hkdspvbjdz iobyxmoadg(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return zoijcleaow(this.f15641iobyxmoadg.wkgbmnqykc(nufgyqmvbuVar));
        }
    }

    public dxjokdxxww(com.google.crypto.tink.internal.wkgbmnqykc wkgbmnqykcVar, Class cls) {
        if (!wkgbmnqykcVar.dxjokdxxww().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", wkgbmnqykcVar.toString(), cls.getName()));
        }
        this.f15639iobyxmoadg = wkgbmnqykcVar;
        this.f15640zoijcleaow = cls;
    }

    private iobyxmoadg eablkybsjg() {
        return new iobyxmoadg(this.f15639iobyxmoadg.gxszxtbevo());
    }

    private Object gxszxtbevo(hkdspvbjdz hkdspvbjdzVar) throws GeneralSecurityException {
        if (Void.class.equals(this.f15640zoijcleaow)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f15639iobyxmoadg.btonecajqb(hkdspvbjdzVar);
        return this.f15639iobyxmoadg.eablkybsjg(hkdspvbjdzVar, this.f15640zoijcleaow);
    }

    @Override // bb.nufgyqmvbu
    public final nb.esjtqupxsv iobyxmoadg(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) throws GeneralSecurityException {
        try {
            return (nb.esjtqupxsv) nb.esjtqupxsv.sopmlzcsov().ojitshcjhn(zoijcleaow()).rgvfuqvkyq(eablkybsjg().iobyxmoadg(nufgyqmvbuVar).toByteString()).agtfadlqog(this.f15639iobyxmoadg.lqeggnwhkg()).ppxfxbqfkf();
        } catch (InvalidProtocolBufferException e13) {
            throw new GeneralSecurityException("Unexpected proto", e13);
        }
    }

    @Override // bb.nufgyqmvbu
    public final Object ppxfxbqfkf(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) throws GeneralSecurityException {
        try {
            return gxszxtbevo(this.f15639iobyxmoadg.nufgyqmvbu(nufgyqmvbuVar));
        } catch (InvalidProtocolBufferException e13) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f15639iobyxmoadg.ppxfxbqfkf().getName(), e13);
        }
    }

    @Override // bb.nufgyqmvbu
    public final hkdspvbjdz wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) throws GeneralSecurityException {
        try {
            return eablkybsjg().iobyxmoadg(nufgyqmvbuVar);
        } catch (InvalidProtocolBufferException e13) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f15639iobyxmoadg.gxszxtbevo().zoijcleaow().getName(), e13);
        }
    }

    @Override // bb.nufgyqmvbu
    public final String zoijcleaow() {
        return this.f15639iobyxmoadg.wkgbmnqykc();
    }
}
