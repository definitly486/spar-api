package g6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hcddaimhww {
    public static final Object iobyxmoadg(pkzmftpjix pkzmftpjixVar, String label, tg.iobyxmoadg block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pkzmftpjixVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(label, "label");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        boolean zIsEnabled = pkzmftpjixVar.isEnabled();
        if (zIsEnabled) {
            try {
                pkzmftpjixVar.iobyxmoadg(label);
            } finally {
                kotlin.jvm.internal.oxmwwwfdhm.zoijcleaow(1);
                if (zIsEnabled) {
                    pkzmftpjixVar.wkgbmnqykc();
                }
                kotlin.jvm.internal.oxmwwwfdhm.iobyxmoadg(1);
            }
        }
        return block.invoke();
    }
}
