package ru.tinkoff.decoro.slots;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class zoijcleaow extends HashSet implements Slot.zoijcleaow {
    public zoijcleaow() {
    }

    public static zoijcleaow iobyxmoadg(Slot.zoijcleaow... zoijcleaowVarArr) {
        if (zoijcleaowVarArr == null) {
            return new zoijcleaow();
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(zoijcleaowVarArr.length);
        for (Slot.zoijcleaow zoijcleaowVar2 : zoijcleaowVarArr) {
            if (zoijcleaowVar2 instanceof zoijcleaow) {
                zoijcleaowVar.addAll((zoijcleaow) zoijcleaowVar2);
            } else {
                zoijcleaowVar.add(zoijcleaowVar2);
            }
        }
        return zoijcleaowVar;
    }

    @Override // ru.tinkoff.decoro.slots.Slot.zoijcleaow
    public boolean iozdgvuglv(char c13) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (((Slot.zoijcleaow) it.next()).iozdgvuglv(c13)) {
                return true;
            }
        }
        return false;
    }

    public zoijcleaow(int i13) {
        super(i13);
    }
}
