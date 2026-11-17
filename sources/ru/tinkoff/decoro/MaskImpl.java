package ru.tinkoff.decoro;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import ru.tinkoff.decoro.slots.Slot;

/* JADX INFO: loaded from: classes6.dex */
public class MaskImpl implements Mask {
    public static final Parcelable.Creator<MaskImpl> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f104835cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f104836esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f104837iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f104838jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private SlotsList f104839lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Character f104840yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f104841zdlpuopuiu;

    static class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public MaskImpl createFromParcel(Parcel parcel) {
            return new MaskImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public MaskImpl[] newArray(int i13) {
            return new MaskImpl[i13];
        }
    }

    public MaskImpl(Slot[] slotArr, boolean z13) {
        this.f104836esjtqupxsv = true;
        this.f104841zdlpuopuiu = z13;
        SlotsList slotsListWflxmlrfwp = SlotsList.wflxmlrfwp(slotArr);
        this.f104839lereixgezr = slotsListWflxmlrfwp;
        if (slotsListWflxmlrfwp.size() != 1 || z13) {
            return;
        }
        gxszxtbevo(1);
    }

    private boolean dxjokdxxww(Slot slot) {
        if (slot == null) {
            throw new IllegalArgumentException("first slot is null");
        }
        do {
            if (!slot.hcddaimhww(-149635) && !slot.wwaezpbzkn() && slot.lmojexxdyd() == null) {
                return false;
            }
            slot = slot.btonecajqb();
        } while (slot != null);
        return true;
    }

    private int eablkybsjg() {
        int i13 = 0;
        for (Slot slotGxszxtbevo = this.f104839lereixgezr.gxszxtbevo(); slotGxszxtbevo != null && slotGxszxtbevo.lmojexxdyd() == null; slotGxszxtbevo = slotGxszxtbevo.yggfygwlhe()) {
            i13++;
        }
        return i13;
    }

    private String esjtqupxsv(Slot slot, boolean z13) {
        StringBuilder sb3 = new StringBuilder();
        int i13 = 0;
        while (slot != null) {
            Character chLmojexxdyd = slot.lmojexxdyd();
            if (z13 || !slot.hcddaimhww(14779)) {
                boolean zLqeggnwhkg = slot.lqeggnwhkg();
                if (!zLqeggnwhkg && !this.f104838jyumaefscl && (!this.f104836esjtqupxsv || !this.f104839lereixgezr.zoijcleaow((slot.ylkuphrtab() - 1) + i13))) {
                    break;
                }
                if (chLmojexxdyd != null || (!this.f104838jyumaefscl && !zLqeggnwhkg)) {
                    if (chLmojexxdyd == null) {
                        break;
                    }
                } else {
                    chLmojexxdyd = btonecajqb();
                }
                sb3.append(chLmojexxdyd);
            }
            slot = slot.btonecajqb();
            i13++;
        }
        return sb3.toString();
    }

    private void gxszxtbevo(int i13) {
        if (this.f104841zdlpuopuiu || i13 < 1) {
            return;
        }
        while (true) {
            i13--;
            if (i13 < 0) {
                return;
            }
            SlotsList slotsList = this.f104839lereixgezr;
            Slot slotBtonecajqb = slotsList.btonecajqb(slotsList.size(), this.f104839lereixgezr.gxszxtbevo());
            slotBtonecajqb.jlmebxxoox(null);
            slotBtonecajqb.jhduphickx(-149635);
        }
    }

    private zoijcleaow iozdgvuglv(Slot slot, char c13) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(null);
        while (slot != null && !slot.nufgyqmvbu(c13)) {
            if (!zoijcleaowVar.f104843zoijcleaow && !slot.wwaezpbzkn()) {
                zoijcleaowVar.f104843zoijcleaow = true;
            }
            slot = slot.btonecajqb();
            zoijcleaowVar.f104842iobyxmoadg++;
        }
        return zoijcleaowVar;
    }

    private String iwizpuwonk(boolean z13) {
        return !this.f104839lereixgezr.isEmpty() ? esjtqupxsv(this.f104839lereixgezr.eablkybsjg(), z13) : "";
    }

    private boolean oxmwwwfdhm(Slot slot, Slot slot2) {
        return slot.hcddaimhww(-149635) && slot2.hcddaimhww(-149635) && slot.lmojexxdyd() == null && slot2.lmojexxdyd() == null;
    }

    private Deque ppxfxbqfkf(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(charSequence.length());
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            arrayDeque.push(Character.valueOf(charSequence.charAt(length)));
        }
        return arrayDeque;
    }

    private void yadqdtsiqt() {
        if (this.f104841zdlpuopuiu || this.f104839lereixgezr.isEmpty()) {
            return;
        }
        Slot slotGxszxtbevo = this.f104839lereixgezr.gxszxtbevo();
        Slot slotYggfygwlhe = slotGxszxtbevo.yggfygwlhe();
        while (oxmwwwfdhm(slotGxszxtbevo, slotYggfygwlhe)) {
            SlotsList slotsList = this.f104839lereixgezr;
            slotsList.yggfygwlhe(slotsList.size() - 1);
            Slot slot = slotYggfygwlhe;
            slotYggfygwlhe = slotYggfygwlhe.yggfygwlhe();
            slotGxszxtbevo = slot;
        }
    }

    private int yggfygwlhe(int i13, int i14, boolean z13) {
        int i15;
        Slot slotDxjokdxxww;
        int iJlmebxxoox = i13;
        for (int i16 = 0; i16 < i14; i16++) {
            if (this.f104839lereixgezr.zoijcleaow(iJlmebxxoox) && (slotDxjokdxxww = this.f104839lereixgezr.dxjokdxxww(iJlmebxxoox)) != null && (!slotDxjokdxxww.wwaezpbzkn() || (z13 && i14 == 1))) {
                iJlmebxxoox += slotDxjokdxxww.jlmebxxoox(null);
            }
            iJlmebxxoox--;
        }
        int i17 = iJlmebxxoox + 1;
        yadqdtsiqt();
        int i18 = i17;
        while (true) {
            i15 = i18 - 1;
            Slot slotDxjokdxxww2 = this.f104839lereixgezr.dxjokdxxww(i15);
            if (slotDxjokdxxww2 == null || !slotDxjokdxxww2.wwaezpbzkn() || i15 <= 0) {
                break;
            }
            i18 = i15;
        }
        this.f104836esjtqupxsv = i15 <= 0 && !this.f104835cqumvgiudr;
        if (i15 > 0) {
            i17 = (this.f104839lereixgezr.zoijcleaow(i13) && this.f104839lereixgezr.dxjokdxxww(i13).wwaezpbzkn() && i14 == 1) ? i15 : i18;
        }
        if (i17 < 0 || i17 > this.f104839lereixgezr.size()) {
            return 0;
        }
        return i17;
    }

    public static MaskImpl zoijcleaow(Slot[] slotArr) {
        return new MaskImpl(slotArr, true);
    }

    @Override // ru.tinkoff.decoro.Mask
    public void M(boolean z13) {
        this.f104835cqumvgiudr = z13;
        if (gtknphoqwx()) {
            return;
        }
        this.f104836esjtqupxsv = !this.f104835cqumvgiudr;
    }

    @Override // ru.tinkoff.decoro.Mask
    public int a(int i13, int i14) {
        return yggfygwlhe(i13, i14, true);
    }

    public Character btonecajqb() {
        Character ch2 = this.f104840yggfygwlhe;
        return Character.valueOf(ch2 != null ? ch2.charValue() : '_');
    }

    @Override // ru.tinkoff.decoro.Mask
    public String crxdokpmqz() {
        return iwizpuwonk(false);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ru.tinkoff.decoro.Mask
    public int f0(CharSequence charSequence) {
        return wflxmlrfwp(0, charSequence, true);
    }

    public boolean gtknphoqwx() {
        if (this.f104839lereixgezr.isEmpty()) {
            return false;
        }
        return this.f104839lereixgezr.eablkybsjg().lqeggnwhkg();
    }

    @Override // java.lang.Iterable
    public Iterator<Slot> iterator() {
        return this.f104839lereixgezr.iterator();
    }

    @Override // ru.tinkoff.decoro.Mask
    public int krqnebusok(int i13, CharSequence charSequence) {
        return wflxmlrfwp(i13, charSequence, true);
    }

    @Override // ru.tinkoff.decoro.Mask
    public int lxfrhoxuzk() {
        int i13 = 0;
        for (Slot slotDxjokdxxww = this.f104839lereixgezr.dxjokdxxww(0); slotDxjokdxxww != null && slotDxjokdxxww.lmojexxdyd() != null; slotDxjokdxxww = slotDxjokdxxww.btonecajqb()) {
            i13++;
        }
        return i13;
    }

    @Override // ru.tinkoff.decoro.Mask
    public int rhgxfdycjh(int i13, int i14) {
        return yggfygwlhe(i13, i14, false);
    }

    public String toString() {
        return iwizpuwonk(true);
    }

    public int wflxmlrfwp(int i13, CharSequence charSequence, boolean z13) {
        if (!this.f104839lereixgezr.isEmpty() && this.f104839lereixgezr.zoijcleaow(i13) && charSequence != null && charSequence.length() != 0) {
            boolean z14 = true;
            this.f104836esjtqupxsv = true;
            Slot slotDxjokdxxww = this.f104839lereixgezr.dxjokdxxww(i13);
            if (this.f104837iwizpuwonk && dxjokdxxww(slotDxjokdxxww)) {
                return i13;
            }
            Deque dequePpxfxbqfkf = ppxfxbqfkf(charSequence);
            while (true) {
                if (dequePpxfxbqfkf.isEmpty()) {
                    break;
                }
                Character ch2 = (Character) dequePpxfxbqfkf.pop();
                zoijcleaow zoijcleaowVarIozdgvuglv = iozdgvuglv(slotDxjokdxxww, ch2.charValue());
                if (this.f104838jyumaefscl || !zoijcleaowVarIozdgvuglv.f104843zoijcleaow) {
                    i13 += zoijcleaowVarIozdgvuglv.f104842iobyxmoadg;
                    Slot slotDxjokdxxww2 = this.f104839lereixgezr.dxjokdxxww(i13);
                    if (slotDxjokdxxww2 != null) {
                        i13 += slotDxjokdxxww2.ribwqtqdhb(ch2, zoijcleaowVarIozdgvuglv.f104842iobyxmoadg > 0);
                        slotDxjokdxxww = this.f104839lereixgezr.dxjokdxxww(i13);
                        if (!this.f104841zdlpuopuiu && eablkybsjg() < 1) {
                            gxszxtbevo(1);
                        }
                    }
                }
            }
            if (z13) {
                int iYlkuphrtab = slotDxjokdxxww != null ? slotDxjokdxxww.ylkuphrtab() : 0;
                if (iYlkuphrtab > 0) {
                    i13 += iYlkuphrtab;
                }
            }
            Slot slotDxjokdxxww3 = this.f104839lereixgezr.dxjokdxxww(i13);
            if (slotDxjokdxxww3 != null && slotDxjokdxxww3.lqeggnwhkg()) {
                z14 = false;
            }
            this.f104836esjtqupxsv = z14;
        }
        return i13;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByte(this.f104841zdlpuopuiu ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.f104840yggfygwlhe);
        parcel.writeByte(this.f104838jyumaefscl ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f104837iwizpuwonk ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f104835cqumvgiudr ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f104836esjtqupxsv ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f104839lereixgezr, i13);
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f104842iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f104843zoijcleaow;

        private zoijcleaow() {
            this.f104842iobyxmoadg = 0;
        }

        /* synthetic */ zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    public MaskImpl(MaskImpl maskImpl) {
        this(maskImpl, maskImpl.f104841zdlpuopuiu);
    }

    public MaskImpl(MaskImpl maskImpl, boolean z13) {
        this.f104836esjtqupxsv = true;
        this.f104841zdlpuopuiu = z13;
        this.f104840yggfygwlhe = maskImpl.f104840yggfygwlhe;
        this.f104838jyumaefscl = maskImpl.f104838jyumaefscl;
        this.f104837iwizpuwonk = maskImpl.f104837iwizpuwonk;
        this.f104835cqumvgiudr = maskImpl.f104835cqumvgiudr;
        this.f104836esjtqupxsv = maskImpl.f104836esjtqupxsv;
        this.f104839lereixgezr = new SlotsList(maskImpl.f104839lereixgezr);
    }

    protected MaskImpl(Parcel parcel) {
        this.f104841zdlpuopuiu = true;
        this.f104836esjtqupxsv = true;
        this.f104841zdlpuopuiu = parcel.readByte() != 0;
        this.f104840yggfygwlhe = (Character) parcel.readSerializable();
        this.f104838jyumaefscl = parcel.readByte() != 0;
        this.f104837iwizpuwonk = parcel.readByte() != 0;
        this.f104835cqumvgiudr = parcel.readByte() != 0;
        this.f104836esjtqupxsv = parcel.readByte() != 0;
        this.f104839lereixgezr = (SlotsList) parcel.readParcelable(SlotsList.class.getClassLoader());
    }
}
