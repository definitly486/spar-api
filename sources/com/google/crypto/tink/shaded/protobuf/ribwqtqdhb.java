package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class ribwqtqdhb implements hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hkdspvbjdz f23997iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object[] f23998ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f23999wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24000zoijcleaow;

    ribwqtqdhb(hkdspvbjdz hkdspvbjdzVar, String str, Object[] objArr) {
        this.f23997iobyxmoadg = hkdspvbjdzVar;
        this.f24000zoijcleaow = str;
        this.f23998ppxfxbqfkf = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f23999wkgbmnqykc = cCharAt;
            return;
        }
        int i13 = cCharAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 55296) {
                this.f23999wkgbmnqykc = i13 | (cCharAt2 << i14);
                return;
            } else {
                i13 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hcddaimhww
    public hkdspvbjdz getDefaultInstance() {
        return this.f23997iobyxmoadg;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hcddaimhww
    public sopmlzcsov getSyntax() {
        return (this.f23999wkgbmnqykc & 1) == 1 ? sopmlzcsov.PROTO2 : sopmlzcsov.PROTO3;
    }

    Object[] iobyxmoadg() {
        return this.f23998ppxfxbqfkf;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hcddaimhww
    public boolean isMessageSetWireFormat() {
        return (this.f23999wkgbmnqykc & 2) == 2;
    }

    String zoijcleaow() {
        return this.f24000zoijcleaow;
    }
}
