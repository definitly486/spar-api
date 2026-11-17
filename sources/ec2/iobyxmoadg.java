package ec2;

import ru.tinkoff.decoro.slots.Slot;
import ru.tinkoff.decoro.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public class iobyxmoadg {
    public Slot[] iobyxmoadg(CharSequence charSequence) {
        if (zoijcleaow.iobyxmoadg(charSequence)) {
            throw new IllegalArgumentException("String representation of the mask's slots is empty");
        }
        Slot[] slotArr = new Slot[charSequence.length()];
        for (int i13 = 0; i13 < charSequence.length(); i13++) {
            slotArr[i13] = zoijcleaow(charSequence.charAt(i13));
        }
        return slotArr;
    }

    protected Slot ppxfxbqfkf(char c13) {
        return ru.tinkoff.decoro.slots.iobyxmoadg.ppxfxbqfkf(c13);
    }

    protected Slot wkgbmnqykc() {
        return ru.tinkoff.decoro.slots.iobyxmoadg.zoijcleaow();
    }

    protected Slot zoijcleaow(char c13) {
        return c13 == '_' ? wkgbmnqykc() : ppxfxbqfkf(c13);
    }
}
