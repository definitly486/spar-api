package xl;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes3.dex */
abstract class jyumaefscl {
    static gxszxtbevo.iobyxmoadg iobyxmoadg(zdlpuopuiu zdlpuopuiuVar) {
        gxszxtbevo gxszxtbevoVarJpowsppfya = zdlpuopuiuVar.jpowsppfya();
        if (gxszxtbevoVarJpowsppfya == null) {
            gxszxtbevoVarJpowsppfya = new gxszxtbevo("");
        }
        return gxszxtbevoVarJpowsppfya.C();
    }

    static Spliterator ppxfxbqfkf(Iterator it) {
        return Spliterators.spliteratorUnknownSize(it, 273);
    }

    static Stream wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, Class cls) {
        return StreamSupport.stream(ppxfxbqfkf(new yggfygwlhe(zdlpuopuiuVar, cls)), false);
    }

    static yl.oxmwwwfdhm zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
        gxszxtbevo gxszxtbevoVarJpowsppfya = zdlpuopuiuVar.jpowsppfya();
        return gxszxtbevoVarJpowsppfya != null ? gxszxtbevoVarJpowsppfya.E() : new yl.oxmwwwfdhm(new yl.wflxmlrfwp());
    }
}
