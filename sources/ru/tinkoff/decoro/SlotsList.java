package ru.tinkoff.decoro;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Array;
import java.util.Iterator;
import ru.tinkoff.decoro.slots.Slot;

/* JADX INFO: loaded from: classes6.dex */
class SlotsList implements Iterable<Slot>, Parcelable {
    public static final Parcelable.Creator<SlotsList> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Slot f104844jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Slot f104845yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f104846zdlpuopuiu;

    static class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SlotsList createFromParcel(Parcel parcel) {
            return new SlotsList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public SlotsList[] newArray(int i13) {
            return new SlotsList[i13];
        }
    }

    private static class zoijcleaow implements Iterator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Slot f104847zdlpuopuiu;

        public zoijcleaow(Slot slot) {
            if (slot == null) {
                throw new IllegalArgumentException("Initial slot for iterator cannot be null");
            }
            this.f104847zdlpuopuiu = slot;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f104847zdlpuopuiu != null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Slot next() {
            Slot slot = this.f104847zdlpuopuiu;
            this.f104847zdlpuopuiu = slot.btonecajqb();
            return slot;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Mask cannot be modified from outside!");
        }
    }

    public SlotsList() {
        this.f104846zdlpuopuiu = 0;
    }

    private static void gtknphoqwx(Slot[] slotArr, SlotsList slotsList) {
        Slot slot = new Slot(slotArr[0]);
        slotsList.f104845yggfygwlhe = slot;
        if (slotsList.f104846zdlpuopuiu == 1) {
            slotsList.f104844jyumaefscl = slot;
        }
        int i13 = 1;
        while (i13 < slotArr.length) {
            Slot slot2 = new Slot(slotArr[i13]);
            slot.tzroggbefp(slot2);
            slot2.sopmlzcsov(slot);
            if (i13 == slotArr.length - 1) {
                slotsList.f104844jyumaefscl = slot2;
            }
            i13++;
            slot = slot2;
        }
    }

    private boolean ppxfxbqfkf(Slot slot) {
        Iterator<Slot> it = iterator();
        while (it.hasNext()) {
            if (it.next() == slot) {
                return true;
            }
        }
        return false;
    }

    public static SlotsList wflxmlrfwp(Slot[] slotArr) {
        SlotsList slotsList = new SlotsList();
        int length = slotArr.length;
        slotsList.f104846zdlpuopuiu = length;
        if (length == 0) {
            return slotsList;
        }
        gtknphoqwx(slotArr, slotsList);
        return slotsList;
    }

    public Slot btonecajqb(int i13, Slot slot) {
        Slot slotYggfygwlhe;
        if (i13 < 0 || this.f104846zdlpuopuiu < i13) {
            throw new IndexOutOfBoundsException("New slot position should be inside the slots list. Or on the tail (position = size)");
        }
        Slot slot2 = new Slot(slot);
        Slot slotDxjokdxxww = dxjokdxxww(i13);
        if (slotDxjokdxxww == null) {
            slotYggfygwlhe = this.f104844jyumaefscl;
            slotDxjokdxxww = null;
        } else {
            slotYggfygwlhe = slotDxjokdxxww.yggfygwlhe();
        }
        slot2.tzroggbefp(slotDxjokdxxww);
        slot2.sopmlzcsov(slotYggfygwlhe);
        if (slotDxjokdxxww != null) {
            slotDxjokdxxww.sopmlzcsov(slot2);
        }
        if (slotYggfygwlhe != null) {
            slotYggfygwlhe.tzroggbefp(slot2);
        }
        if (i13 == 0) {
            this.f104845yggfygwlhe = slot2;
        } else if (i13 == this.f104846zdlpuopuiu) {
            this.f104844jyumaefscl = slot2;
        }
        this.f104846zdlpuopuiu++;
        return slot2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Slot dxjokdxxww(int i13) {
        Slot slotBtonecajqb;
        if (!zoijcleaow(i13)) {
            return null;
        }
        int i14 = this.f104846zdlpuopuiu;
        if (i13 < (i14 >> 1)) {
            slotBtonecajqb = this.f104845yggfygwlhe;
            for (int i15 = 0; i15 < i13; i15++) {
                slotBtonecajqb = slotBtonecajqb.btonecajqb();
            }
        } else {
            Slot slotYggfygwlhe = this.f104844jyumaefscl;
            for (int i16 = i14 - 1; i16 > i13; i16--) {
                slotYggfygwlhe = slotYggfygwlhe.yggfygwlhe();
            }
            slotBtonecajqb = slotYggfygwlhe;
        }
        if (slotBtonecajqb != null) {
            return slotBtonecajqb;
        }
        throw new IllegalStateException("Slot inside the mask should not be null. But it is.");
    }

    public Slot eablkybsjg() {
        return this.f104845yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlotsList slotsList = (SlotsList) obj;
        if (slotsList.size() != size()) {
            return false;
        }
        Iterator<Slot> it = iterator();
        Iterator<Slot> it2 = slotsList.iterator();
        while (it2.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Slot gxszxtbevo() {
        return this.f104844jyumaefscl;
    }

    public boolean isEmpty() {
        return this.f104846zdlpuopuiu == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Slot> iterator() {
        return new zoijcleaow(this.f104845yggfygwlhe);
    }

    public Slot[] iwizpuwonk() {
        return isEmpty() ? new Slot[0] : (Slot[]) toArray(new Slot[size()]);
    }

    public Slot oxmwwwfdhm(Slot slot) {
        if (slot == null || !ppxfxbqfkf(slot)) {
            return null;
        }
        Slot slotYggfygwlhe = slot.yggfygwlhe();
        Slot slotBtonecajqb = slot.btonecajqb();
        if (slotYggfygwlhe != null) {
            slotYggfygwlhe.tzroggbefp(slotBtonecajqb);
        } else {
            this.f104845yggfygwlhe = slotBtonecajqb;
        }
        if (slotBtonecajqb != null) {
            slotBtonecajqb.sopmlzcsov(slotYggfygwlhe);
        } else {
            this.f104844jyumaefscl = slotYggfygwlhe;
        }
        this.f104846zdlpuopuiu--;
        return slot;
    }

    public int size() {
        return this.f104846zdlpuopuiu;
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr == null || objArr.length < this.f104846zdlpuopuiu) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f104846zdlpuopuiu);
        }
        Iterator<Slot> it = iterator();
        int i13 = 0;
        while (it.hasNext()) {
            objArr[i13] = it.next();
            i13++;
        }
        return objArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f104846zdlpuopuiu);
        if (this.f104846zdlpuopuiu > 0) {
            parcel.writeTypedArray(iwizpuwonk(), i13);
        }
    }

    public Slot yggfygwlhe(int i13) {
        if (zoijcleaow(i13)) {
            return oxmwwwfdhm(dxjokdxxww(i13));
        }
        throw new IndexOutOfBoundsException("Slot position should be inside the slots list");
    }

    public boolean zoijcleaow(int i13) {
        return i13 >= 0 && i13 < this.f104846zdlpuopuiu;
    }

    public SlotsList(SlotsList slotsList) {
        this.f104846zdlpuopuiu = 0;
        if (slotsList.isEmpty()) {
            return;
        }
        Iterator<Slot> it = slotsList.iterator();
        Slot slot = null;
        while (it.hasNext()) {
            Slot slot2 = new Slot(it.next());
            if (this.f104846zdlpuopuiu == 0) {
                this.f104845yggfygwlhe = slot2;
            } else {
                slot.tzroggbefp(slot2);
                slot2.sopmlzcsov(slot);
            }
            this.f104846zdlpuopuiu++;
            slot = slot2;
        }
        this.f104844jyumaefscl = slot;
    }

    protected SlotsList(Parcel parcel) {
        this.f104846zdlpuopuiu = 0;
        int i13 = parcel.readInt();
        this.f104846zdlpuopuiu = i13;
        if (i13 > 0) {
            Slot[] slotArr = new Slot[i13];
            parcel.readTypedArray(slotArr, Slot.CREATOR);
            gtknphoqwx(slotArr, this);
        }
    }
}
