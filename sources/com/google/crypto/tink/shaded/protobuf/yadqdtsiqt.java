package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class yadqdtsiqt implements ikoacuggdj {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final jpowsppfya f24079zoijcleaow = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya f24080iobyxmoadg;

    class iobyxmoadg implements jpowsppfya {
        iobyxmoadg() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.jpowsppfya
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.jpowsppfya
        public hcddaimhww messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    private static class zoijcleaow implements jpowsppfya {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private jpowsppfya[] f24081iobyxmoadg;

        zoijcleaow(jpowsppfya... jpowsppfyaVarArr) {
            this.f24081iobyxmoadg = jpowsppfyaVarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.jpowsppfya
        public boolean isSupported(Class cls) {
            for (jpowsppfya jpowsppfyaVar : this.f24081iobyxmoadg) {
                if (jpowsppfyaVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.jpowsppfya
        public hcddaimhww messageInfoFor(Class cls) {
            for (jpowsppfya jpowsppfyaVar : this.f24081iobyxmoadg) {
                if (jpowsppfyaVar.isSupported(cls)) {
                    return jpowsppfyaVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public yadqdtsiqt() {
        this(iobyxmoadg());
    }

    private static jpowsppfya iobyxmoadg() {
        return new zoijcleaow(jyumaefscl.iobyxmoadg(), zoijcleaow());
    }

    private static boolean ppxfxbqfkf(hcddaimhww hcddaimhwwVar) {
        return hcddaimhwwVar.getSyntax() == sopmlzcsov.PROTO2;
    }

    private static jhduphickx wkgbmnqykc(Class cls, hcddaimhww hcddaimhwwVar) {
        if (iwizpuwonk.class.isAssignableFrom(cls)) {
            return ppxfxbqfkf(hcddaimhwwVar) ? wypolnanlu.hkdspvbjdz(cls, hcddaimhwwVar, mbcevpiqjq.zoijcleaow(), istkbnxepw.zoijcleaow(), okpsazkaxt.jpowsppfya(), oxmwwwfdhm.zoijcleaow(), pkzmftpjix.zoijcleaow()) : wypolnanlu.hkdspvbjdz(cls, hcddaimhwwVar, mbcevpiqjq.zoijcleaow(), istkbnxepw.zoijcleaow(), okpsazkaxt.jpowsppfya(), null, pkzmftpjix.zoijcleaow());
        }
        return ppxfxbqfkf(hcddaimhwwVar) ? wypolnanlu.hkdspvbjdz(cls, hcddaimhwwVar, mbcevpiqjq.iobyxmoadg(), istkbnxepw.iobyxmoadg(), okpsazkaxt.lmojexxdyd(), oxmwwwfdhm.iobyxmoadg(), pkzmftpjix.iobyxmoadg()) : wypolnanlu.hkdspvbjdz(cls, hcddaimhwwVar, mbcevpiqjq.iobyxmoadg(), istkbnxepw.iobyxmoadg(), okpsazkaxt.wwaezpbzkn(), null, pkzmftpjix.iobyxmoadg());
    }

    private static jpowsppfya zoijcleaow() {
        try {
            return (jpowsppfya) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f24079zoijcleaow;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ikoacuggdj
    public jhduphickx createSchema(Class cls) {
        okpsazkaxt.ylkuphrtab(cls);
        hcddaimhww hcddaimhwwVarMessageInfoFor = this.f24080iobyxmoadg.messageInfoFor(cls);
        if (hcddaimhwwVarMessageInfoFor.isMessageSetWireFormat()) {
            return iwizpuwonk.class.isAssignableFrom(cls) ? stevsuqkhv.gxszxtbevo(okpsazkaxt.jpowsppfya(), oxmwwwfdhm.zoijcleaow(), hcddaimhwwVarMessageInfoFor.getDefaultInstance()) : stevsuqkhv.gxszxtbevo(okpsazkaxt.lmojexxdyd(), oxmwwwfdhm.iobyxmoadg(), hcddaimhwwVarMessageInfoFor.getDefaultInstance());
        }
        return wkgbmnqykc(cls, hcddaimhwwVarMessageInfoFor);
    }

    private yadqdtsiqt(jpowsppfya jpowsppfyaVar) {
        this.f24080iobyxmoadg = (jpowsppfya) esjtqupxsv.zoijcleaow(jpowsppfyaVar, "messageInfoFactory");
    }
}
