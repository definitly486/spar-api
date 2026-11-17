package nx0;

import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.network.model.WarningDto;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {
    List iobyxmoadg();

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    default int ppxfxbqfkf(WarningDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        Iterator it = iobyxmoadg().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (zdlpuopuiu.eablkybsjg(((w21.iobyxmoadg) it.next()).iobyxmoadg(), dto.getCode())) {
                if (i13 >= 0) {
                    return i13;
                }
                return jyumaefscl.ojitshcjhn(iobyxmoadg());
            }
            i13++;
        }
        i13 = -1;
        if (i13 >= 0) {
            return i13;
        }
        return jyumaefscl.ojitshcjhn(iobyxmoadg());
    }

    default WarningDto zoijcleaow(List warnings) {
        Object obj;
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        Iterator it = warnings.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iPpxfxbqfkf = ppxfxbqfkf((WarningDto) next);
                do {
                    Object next2 = it.next();
                    int iPpxfxbqfkf2 = ppxfxbqfkf((WarningDto) next2);
                    if (iPpxfxbqfkf > iPpxfxbqfkf2) {
                        next = next2;
                        iPpxfxbqfkf = iPpxfxbqfkf2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (WarningDto) obj;
    }
}
