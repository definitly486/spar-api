package ru.tinkoff.decoro.slots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.yggfygwlhe;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class Slot implements Serializable, Parcelable {
    public static final Parcelable.Creator<Slot> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private transient Slot f104848cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private transient Slot f104849esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ru.tinkoff.decoro.slots.zoijcleaow f104850iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Set f104851jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Character f104852yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f104853zdlpuopuiu;

    static class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Slot createFromParcel(Parcel parcel) {
            return new Slot(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public Slot[] newArray(int i13) {
            return new Slot[i13];
        }
    }

    public interface zoijcleaow extends Serializable {
        boolean iozdgvuglv(char c13);
    }

    public Slot(int i13, Character ch2, ru.tinkoff.decoro.slots.zoijcleaow zoijcleaowVar) {
        this.f104853zdlpuopuiu = 0;
        this.f104851jyumaefscl = new HashSet();
        this.f104853zdlpuopuiu = i13;
        this.f104852yggfygwlhe = ch2;
        this.f104850iwizpuwonk = zoijcleaowVar == null ? new ru.tinkoff.decoro.slots.zoijcleaow() : zoijcleaowVar;
    }

    private int cllcsxoeiz(int i13, Character ch2, Slot slot) {
        if (slot == null) {
            return 0;
        }
        return this.f104848cqumvgiudr.vipkmwdibw(i13, ch2, true);
    }

    private boolean dxjokdxxww(int i13) {
        return (this.f104853zdlpuopuiu & i13) == i13;
    }

    private boolean iozdgvuglv(char c13) {
        ru.tinkoff.decoro.slots.zoijcleaow zoijcleaowVar = this.f104850iwizpuwonk;
        return zoijcleaowVar == null || zoijcleaowVar.iozdgvuglv(c13);
    }

    private Character jpowsppfya(Slot slot) {
        if (slot == null) {
            return null;
        }
        if (slot.wwaezpbzkn()) {
            if (slot.btonecajqb() != null) {
                return jpowsppfya(slot.btonecajqb());
            }
            return null;
        }
        Character chLmojexxdyd = slot.lmojexxdyd();
        if (chLmojexxdyd != null && !iozdgvuglv(chLmojexxdyd.charValue())) {
            return null;
        }
        slot.stevsuqkhv();
        return chLmojexxdyd;
    }

    private int kegysxyocb(int i13, Character ch2, boolean z13) {
        int iCllcsxoeiz;
        boolean z14 = true;
        boolean z15 = z13 && dxjokdxxww(2) && !dxjokdxxww(1);
        if (wwaezpbzkn() && !z15 && this.f104852yggfygwlhe.equals(ch2)) {
            return dxjokdxxww(8) ? i13 : i13 + 1;
        }
        if (dxjokdxxww(2) || z15) {
            iCllcsxoeiz = cllcsxoeiz(i13 + 1, ch2, this.f104848cqumvgiudr);
            z14 = false;
        } else {
            iCllcsxoeiz = 0;
        }
        Character ch3 = this.f104852yggfygwlhe;
        if (ch3 != null && (this.f104853zdlpuopuiu & 3) == 0) {
            cllcsxoeiz(0, ch3, this.f104848cqumvgiudr);
        }
        if (!z14) {
            return iCllcsxoeiz;
        }
        this.f104852yggfygwlhe = ch2;
        if (!dxjokdxxww(8)) {
            i13++;
        }
        return i13;
    }

    private void stevsuqkhv() {
        if (!wwaezpbzkn()) {
            this.f104852yggfygwlhe = jpowsppfya(this.f104848cqumvgiudr);
            return;
        }
        Slot slot = this.f104849esjtqupxsv;
        if (slot != null) {
            slot.stevsuqkhv();
        }
    }

    private int vipkmwdibw(int i13, Character ch2, boolean z13) {
        if (ch2 != null) {
            return kegysxyocb(i13, ch2, z13);
        }
        stevsuqkhv();
        return dxjokdxxww(4) ? 1 : 0;
    }

    public Slot btonecajqb() {
        return this.f104848cqumvgiudr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Slot.class != obj.getClass()) {
            return false;
        }
        Slot slot = (Slot) obj;
        if (this.f104853zdlpuopuiu != slot.f104853zdlpuopuiu) {
            return false;
        }
        Character ch2 = this.f104852yggfygwlhe;
        if (ch2 == null ? slot.f104852yggfygwlhe != null : !ch2.equals(slot.f104852yggfygwlhe)) {
            return false;
        }
        Set set = this.f104851jyumaefscl;
        if (set == null ? slot.f104851jyumaefscl != null : !set.equals(slot.f104851jyumaefscl)) {
            return false;
        }
        ru.tinkoff.decoro.slots.zoijcleaow zoijcleaowVar = this.f104850iwizpuwonk;
        ru.tinkoff.decoro.slots.zoijcleaow zoijcleaowVar2 = slot.f104850iwizpuwonk;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar.equals(zoijcleaowVar2);
        }
        return zoijcleaowVar2 == null;
    }

    public int hashCode() {
        int i13 = this.f104853zdlpuopuiu * 31;
        Character ch2 = this.f104852yggfygwlhe;
        int iHashCode = (i13 + (ch2 != null ? ch2.hashCode() : 0)) * 31;
        Set set = this.f104851jyumaefscl;
        int iHashCode2 = (iHashCode + (set != null ? set.hashCode() : 0)) * 31;
        ru.tinkoff.decoro.slots.zoijcleaow zoijcleaowVar = this.f104850iwizpuwonk;
        return iHashCode2 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    public boolean hcddaimhww(Integer num) {
        if (num == null) {
            return false;
        }
        return this.f104851jyumaefscl.contains(num);
    }

    public Slot jhduphickx(Integer... numArr) {
        if (numArr == null) {
            return this;
        }
        for (Integer num : numArr) {
            if (num != null) {
                this.f104851jyumaefscl.add(num);
            }
        }
        return this;
    }

    public int jlmebxxoox(Character ch2) {
        return ribwqtqdhb(ch2, false);
    }

    public Character lmojexxdyd() {
        return this.f104852yggfygwlhe;
    }

    public boolean lqeggnwhkg() {
        if (this.f104852yggfygwlhe != null && !wwaezpbzkn()) {
            return true;
        }
        Slot slot = this.f104848cqumvgiudr;
        if (slot != null) {
            return slot.lqeggnwhkg();
        }
        return false;
    }

    public boolean nufgyqmvbu(char c13) {
        return wwaezpbzkn() ? this.f104852yggfygwlhe.equals(Character.valueOf(c13)) : iozdgvuglv(c13);
    }

    public int pkzmftpjix(int i13) {
        Slot slot;
        if (wwaezpbzkn() && ((slot = this.f104848cqumvgiudr) == null || !slot.wwaezpbzkn())) {
            return i13 + 1;
        }
        if (wwaezpbzkn() && this.f104848cqumvgiudr.wwaezpbzkn()) {
            return this.f104848cqumvgiudr.pkzmftpjix(i13 + 1);
        }
        return -1;
    }

    public int ribwqtqdhb(Character ch2, boolean z13) {
        return vipkmwdibw(0, ch2, z13);
    }

    public void sopmlzcsov(Slot slot) {
        this.f104849esjtqupxsv = slot;
    }

    public String toString() {
        return "Slot{value=" + this.f104852yggfygwlhe + '}';
    }

    public void tzroggbefp(Slot slot) {
        this.f104848cqumvgiudr = slot;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f104853zdlpuopuiu);
        parcel.writeSerializable(this.f104852yggfygwlhe);
        parcel.writeSerializable(this.f104850iwizpuwonk);
        parcel.writeSerializable(null);
        parcel.writeInt(this.f104851jyumaefscl.size());
        Iterator it = this.f104851jyumaefscl.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Integer) it.next()).intValue());
        }
    }

    public boolean wwaezpbzkn() {
        return this.f104852yggfygwlhe != null && dxjokdxxww(2);
    }

    public ru.tinkoff.decoro.slots.zoijcleaow yadqdtsiqt() {
        return this.f104850iwizpuwonk;
    }

    public Slot yggfygwlhe() {
        return this.f104849esjtqupxsv;
    }

    public int ylkuphrtab() {
        return pkzmftpjix(0);
    }

    public Slot(Character ch2, zoijcleaow... zoijcleaowVarArr) {
        this(0, ch2, ru.tinkoff.decoro.slots.zoijcleaow.iobyxmoadg(zoijcleaowVarArr));
    }

    public Slot(Slot slot) {
        this(slot.f104853zdlpuopuiu, slot.f104852yggfygwlhe, slot.yadqdtsiqt());
        this.f104851jyumaefscl.addAll(slot.f104851jyumaefscl);
    }

    protected Slot(Parcel parcel) {
        this.f104853zdlpuopuiu = 0;
        this.f104851jyumaefscl = new HashSet();
        this.f104853zdlpuopuiu = parcel.readInt();
        this.f104852yggfygwlhe = (Character) parcel.readSerializable();
        this.f104850iwizpuwonk = (ru.tinkoff.decoro.slots.zoijcleaow) parcel.readSerializable();
        yggfygwlhe.iobyxmoadg(parcel.readSerializable());
        int i13 = parcel.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            this.f104851jyumaefscl.add(Integer.valueOf(parcel.readInt()));
        }
    }
}
