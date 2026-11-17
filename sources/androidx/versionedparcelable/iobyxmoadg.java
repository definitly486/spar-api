package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg extends VersionedParcel {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f13699btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f13700dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Parcel f13701eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f13702gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f13703gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f13704lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f13705nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final SparseIntArray f13706wkgbmnqykc;

    iobyxmoadg(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.iobyxmoadg(), new androidx.collection.iobyxmoadg(), new androidx.collection.iobyxmoadg());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] dxjokdxxww() {
        int i13 = this.f13701eablkybsjg.readInt();
        if (i13 < 0) {
            return null;
        }
        byte[] bArr = new byte[i13];
        this.f13701eablkybsjg.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void esjtqupxsv(boolean z13) {
        this.f13701eablkybsjg.writeInt(z13 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence gtknphoqwx() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f13701eablkybsjg);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void iobyxmoadg() {
        int i13 = this.f13700dxjokdxxww;
        if (i13 >= 0) {
            int i14 = this.f13706wkgbmnqykc.get(i13);
            int iDataPosition = this.f13701eablkybsjg.dataPosition();
            this.f13701eablkybsjg.setDataPosition(i14);
            this.f13701eablkybsjg.writeInt(iDataPosition - i14);
            this.f13701eablkybsjg.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void istkbnxepw(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f13701eablkybsjg, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void iwizpuwonk(int i13) {
        iobyxmoadg();
        this.f13700dxjokdxxww = i13;
        this.f13706wkgbmnqykc.put(i13, this.f13701eablkybsjg.dataPosition());
        yadqdtsiqt(0);
        yadqdtsiqt(i13);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String kcexrzcfyt() {
        return this.f13701eablkybsjg.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void lmojexxdyd(Parcelable parcelable) {
        this.f13701eablkybsjg.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean lqeggnwhkg() {
        return this.f13701eablkybsjg.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int ojitshcjhn() {
        return this.f13701eablkybsjg.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void pmvmpeiblj(byte[] bArr) {
        if (bArr == null) {
            this.f13701eablkybsjg.writeInt(-1);
        } else {
            this.f13701eablkybsjg.writeInt(bArr.length);
            this.f13701eablkybsjg.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable vdvldrhtss() {
        return this.f13701eablkybsjg.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean wflxmlrfwp(int i13) {
        while (this.f13699btonecajqb < this.f13704lqeggnwhkg) {
            int i14 = this.f13702gtknphoqwx;
            if (i14 == i13) {
                return true;
            }
            if (String.valueOf(i14).compareTo(String.valueOf(i13)) > 0) {
                return false;
            }
            this.f13701eablkybsjg.setDataPosition(this.f13699btonecajqb);
            int i15 = this.f13701eablkybsjg.readInt();
            this.f13702gtknphoqwx = this.f13701eablkybsjg.readInt();
            this.f13699btonecajqb += i15;
        }
        return this.f13702gtknphoqwx == i13;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void yadqdtsiqt(int i13) {
        this.f13701eablkybsjg.writeInt(i13);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void ylkuphrtab(String str) {
        this.f13701eablkybsjg.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel zoijcleaow() {
        Parcel parcel = this.f13701eablkybsjg;
        int iDataPosition = parcel.dataPosition();
        int i13 = this.f13699btonecajqb;
        if (i13 == this.f13703gxszxtbevo) {
            i13 = this.f13704lqeggnwhkg;
        }
        return new iobyxmoadg(parcel, iDataPosition, i13, this.f13705nufgyqmvbu + "  ", this.f13696iobyxmoadg, this.f13698zoijcleaow, this.f13697ppxfxbqfkf);
    }

    private iobyxmoadg(Parcel parcel, int i13, int i14, String str, androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg iobyxmoadgVar2, androidx.collection.iobyxmoadg iobyxmoadgVar3) {
        super(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3);
        this.f13706wkgbmnqykc = new SparseIntArray();
        this.f13700dxjokdxxww = -1;
        this.f13702gtknphoqwx = -1;
        this.f13701eablkybsjg = parcel;
        this.f13703gxszxtbevo = i13;
        this.f13704lqeggnwhkg = i14;
        this.f13699btonecajqb = i13;
        this.f13705nufgyqmvbu = str;
    }
}
