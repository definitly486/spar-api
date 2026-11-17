package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import nb.esjtqupxsv;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn implements vdvldrhtss {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ylkuphrtab f23845eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Integer f23846gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f23847iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final com.google.crypto.tink.shaded.protobuf.nufgyqmvbu f23848ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final esjtqupxsv.ppxfxbqfkf f23849wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.iobyxmoadg f23850zoijcleaow;

    private ojitshcjhn(String str, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar, esjtqupxsv.ppxfxbqfkf ppxfxbqfkfVar, ylkuphrtab ylkuphrtabVar, Integer num) {
        this.f23847iobyxmoadg = str;
        this.f23850zoijcleaow = kcexrzcfyt.eablkybsjg(str);
        this.f23848ppxfxbqfkf = nufgyqmvbuVar;
        this.f23849wkgbmnqykc = ppxfxbqfkfVar;
        this.f23845eablkybsjg = ylkuphrtabVar;
        this.f23846gxszxtbevo = num;
    }

    public static ojitshcjhn zoijcleaow(String str, com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar, esjtqupxsv.ppxfxbqfkf ppxfxbqfkfVar, ylkuphrtab ylkuphrtabVar, Integer num) throws GeneralSecurityException {
        if (ylkuphrtabVar == ylkuphrtab.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new ojitshcjhn(str, nufgyqmvbuVar, ppxfxbqfkfVar, ylkuphrtabVar, num);
    }

    public ylkuphrtab eablkybsjg() {
        return this.f23845eablkybsjg;
    }

    public String gxszxtbevo() {
        return this.f23847iobyxmoadg;
    }

    @Override // com.google.crypto.tink.internal.vdvldrhtss
    public pb.iobyxmoadg iobyxmoadg() {
        return this.f23850zoijcleaow;
    }

    public com.google.crypto.tink.shaded.protobuf.nufgyqmvbu lqeggnwhkg() {
        return this.f23848ppxfxbqfkf;
    }

    public Integer ppxfxbqfkf() {
        return this.f23846gxszxtbevo;
    }

    public esjtqupxsv.ppxfxbqfkf wkgbmnqykc() {
        return this.f23849wkgbmnqykc;
    }
}
