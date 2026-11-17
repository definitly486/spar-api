package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ntlheqmsrt implements iozdgvuglv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wwaezpbzkn f8750iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object[] f8751ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f8752wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f8753zoijcleaow;

    ntlheqmsrt(wwaezpbzkn wwaezpbzknVar, String str, Object[] objArr) {
        this.f8750iobyxmoadg = wwaezpbzknVar;
        this.f8753zoijcleaow = str;
        this.f8751ppxfxbqfkf = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8752wkgbmnqykc = cCharAt;
            return;
        }
        int i13 = cCharAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 55296) {
                this.f8752wkgbmnqykc = i13 | (cCharAt2 << i14);
                return;
            } else {
                i13 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.iozdgvuglv
    public wwaezpbzkn getDefaultInstance() {
        return this.f8750iobyxmoadg;
    }

    @Override // androidx.datastore.preferences.protobuf.iozdgvuglv
    public kegysxyocb getSyntax() {
        return (this.f8752wkgbmnqykc & 1) == 1 ? kegysxyocb.PROTO2 : kegysxyocb.PROTO3;
    }

    Object[] iobyxmoadg() {
        return this.f8751ppxfxbqfkf;
    }

    @Override // androidx.datastore.preferences.protobuf.iozdgvuglv
    public boolean isMessageSetWireFormat() {
        return (this.f8752wkgbmnqykc & 2) == 2;
    }

    String zoijcleaow() {
        return this.f8753zoijcleaow;
    }
}
