package n5;

import java.util.Map;
import pj.iyctptxqzt;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {
    public static final pkzmftpjix iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar) {
        Map mapYggfygwlhe = oxmwwwfdhmVar.yggfygwlhe();
        Object objZoijcleaow = mapYggfygwlhe.get("QueryDispatcher");
        if (objZoijcleaow == null) {
            objZoijcleaow = iyctptxqzt.zoijcleaow(oxmwwwfdhmVar.esjtqupxsv());
            mapYggfygwlhe.put("QueryDispatcher", objZoijcleaow);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objZoijcleaow, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (pkzmftpjix) objZoijcleaow;
    }

    public static final pkzmftpjix zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
        Map mapYggfygwlhe = oxmwwwfdhmVar.yggfygwlhe();
        Object objZoijcleaow = mapYggfygwlhe.get("TransactionDispatcher");
        if (objZoijcleaow == null) {
            objZoijcleaow = iyctptxqzt.zoijcleaow(oxmwwwfdhmVar.istkbnxepw());
            mapYggfygwlhe.put("TransactionDispatcher", objZoijcleaow);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objZoijcleaow, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (pkzmftpjix) objZoijcleaow;
    }
}
