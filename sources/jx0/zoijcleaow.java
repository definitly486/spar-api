package jx0;

import fy0.ColorDto;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f52491iobyxmoadg;

        static {
            int[] iArr = new int[fy0.ppxfxbqfkf.values().length];
            try {
                iArr[fy0.ppxfxbqfkf.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fy0.ppxfxbqfkf.SPAR_WINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fy0.ppxfxbqfkf.EVROPOLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fy0.ppxfxbqfkf.TRENDIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52491iobyxmoadg = iArr;
        }
    }

    private static final ColorsModel.TintsModel iobyxmoadg(ColorDto.TintsDto tintsDto) {
        return new ColorsModel.TintsModel(tintsDto.getPrimary(), tintsDto.getOnPrimary(), tintsDto.getPrimaryDisabled(), tintsDto.getSecondary(), tintsDto.getSecondaryDisabled(), tintsDto.getFeedTitle(), tintsDto.getFeedBackground());
    }

    public static final ColorsModel zoijcleaow(fy0.ppxfxbqfkf ppxfxbqfkfVar, List list) {
        gz0.ppxfxbqfkf ppxfxbqfkfVar2;
        ColorDto colorDto;
        Object next;
        int i13 = ppxfxbqfkfVar == null ? -1 : iobyxmoadg.f52491iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == -1) {
            return null;
        }
        if (i13 == 1) {
            ppxfxbqfkfVar2 = gz0.ppxfxbqfkf.BASE;
        } else if (i13 == 2) {
            ppxfxbqfkfVar2 = gz0.ppxfxbqfkf.SPAR_WINE;
        } else if (i13 == 3) {
            ppxfxbqfkfVar2 = gz0.ppxfxbqfkf.EVROPOLIS;
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar2 = gz0.ppxfxbqfkf.TRENDIS;
        }
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ColorDto) next).getType() != ppxfxbqfkfVar);
            colorDto = (ColorDto) next;
        } else {
            colorDto = null;
        }
        if (colorDto != null) {
            return new ColorsModel(ppxfxbqfkfVar2, iobyxmoadg(colorDto.getLightTint()), iobyxmoadg(colorDto.getDarkTint()));
        }
        return null;
    }
}
