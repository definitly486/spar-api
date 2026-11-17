package ru.tinkoff.decoro.watchers;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import ru.tinkoff.decoro.Mask;
import ru.tinkoff.decoro.slots.Slot;

/* JADX INFO: loaded from: classes6.dex */
class UnmodifiableMask implements Mask {
    public static final Parcelable.Creator<UnmodifiableMask> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Mask f104861zdlpuopuiu;

    static class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public UnmodifiableMask createFromParcel(Parcel parcel) {
            return new UnmodifiableMask(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public UnmodifiableMask[] newArray(int i13) {
            return new UnmodifiableMask[i13];
        }
    }

    public UnmodifiableMask(Mask mask) {
        this.f104861zdlpuopuiu = mask;
    }

    @Override // ru.tinkoff.decoro.Mask
    public void M(boolean z13) {
        Mask mask = this.f104861zdlpuopuiu;
        if (mask != null) {
            mask.M(z13);
        }
    }

    @Override // ru.tinkoff.decoro.Mask
    public int a(int i13, int i14) {
        throw new UnsupportedOperationException();
    }

    @Override // ru.tinkoff.decoro.Mask
    public String crxdokpmqz() {
        Mask mask = this.f104861zdlpuopuiu;
        return mask == null ? "" : mask.crxdokpmqz();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ru.tinkoff.decoro.Mask
    public int f0(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public Iterator<Slot> iterator() {
        Mask mask = this.f104861zdlpuopuiu;
        if (mask == null) {
            return null;
        }
        return mask.iterator();
    }

    @Override // ru.tinkoff.decoro.Mask
    public int krqnebusok(int i13, CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // ru.tinkoff.decoro.Mask
    public int lxfrhoxuzk() {
        Mask mask = this.f104861zdlpuopuiu;
        if (mask == null) {
            return -1;
        }
        return mask.lxfrhoxuzk();
    }

    @Override // ru.tinkoff.decoro.Mask
    public int rhgxfdycjh(int i13, int i14) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        Mask mask = this.f104861zdlpuopuiu;
        return mask == null ? "" : mask.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f104861zdlpuopuiu, i13);
    }

    protected UnmodifiableMask(Parcel parcel) {
        this.f104861zdlpuopuiu = (Mask) parcel.readParcelable(Mask.class.getClassLoader());
    }
}
