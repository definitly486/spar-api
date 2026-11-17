package ni;

import java.util.Arrays;
import jh.lmojexxdyd;
import zi.ikoacuggdj;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends oxmwwwfdhm {
    public eablkybsjg(char c13) {
        super(Character.valueOf(c13));
    }

    private final boolean eablkybsjg(char c13) {
        byte type = (byte) Character.getType(c13);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    private final String ppxfxbqfkf(char c13) {
        switch (c13) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return eablkybsjg(c13) ? String.valueOf(c13) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    @Override // ni.lqeggnwhkg
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) zoijcleaow()).charValue()), ppxfxbqfkf(((Character) zoijcleaow()).charValue())}, 2));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    @Override // ni.lqeggnwhkg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public ikoacuggdj iobyxmoadg(lmojexxdyd module) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        ikoacuggdj ikoacuggdjVarYggfygwlhe = module.wflxmlrfwp().yggfygwlhe();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarYggfygwlhe, "getCharType(...)");
        return ikoacuggdjVarYggfygwlhe;
    }
}
