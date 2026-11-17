package fc2;

import java.util.Arrays;
import ru.tinkoff.decoro.slots.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final char[] f33413yggfygwlhe = {'X', 'x', '*'};

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private char[] f33414zdlpuopuiu = f33413yggfygwlhe;

    @Override // ru.tinkoff.decoro.slots.ppxfxbqfkf
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f33414zdlpuopuiu, ((iobyxmoadg) obj).f33414zdlpuopuiu);
    }

    @Override // ru.tinkoff.decoro.slots.ppxfxbqfkf
    public int hashCode() {
        return Arrays.hashCode(this.f33414zdlpuopuiu);
    }

    @Override // ru.tinkoff.decoro.slots.ppxfxbqfkf, ru.tinkoff.decoro.slots.Slot.zoijcleaow
    public boolean iozdgvuglv(char c13) {
        if (super.iozdgvuglv(c13)) {
            return true;
        }
        for (char c14 : this.f33414zdlpuopuiu) {
            if (c14 == c13) {
                return true;
            }
        }
        return false;
    }
}
