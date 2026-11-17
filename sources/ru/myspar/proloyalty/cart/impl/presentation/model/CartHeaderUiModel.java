package ru.myspar.proloyalty.cart.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;
import wo0.draadjrbmk;
import wo0.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class CartHeaderUiModel implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f92951iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Button f92952zoijcleaow;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/cart/impl/presentation/model/CartHeaderUiModel$Button;", "Landroid/os/Parcelable;", "", "buttonText", "Lru/myspar/proloyalty/cart/impl/presentation/model/CartHeaderUiModel$iobyxmoadg;", "action", "<init>", "(Ljava/lang/String;Lru/myspar/proloyalty/cart/impl/presentation/model/CartHeaderUiModel$iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "istkbnxepw", "yggfygwlhe", "Lru/myspar/proloyalty/cart/impl/presentation/model/CartHeaderUiModel$iobyxmoadg;", "zoijcleaow", "()Lru/myspar/proloyalty/cart/impl/presentation/model/CartHeaderUiModel$iobyxmoadg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {
        public static final Parcelable.Creator<Button> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final iobyxmoadg action;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String buttonText;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Button createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Button(parcel.readString(), iobyxmoadg.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Button[] newArray(int i13) {
                return new Button[i13];
            }
        }

        public Button(String buttonText, iobyxmoadg action) {
            zdlpuopuiu.btonecajqb(buttonText, "buttonText");
            zdlpuopuiu.btonecajqb(action, "action");
            this.buttonText = buttonText;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return zdlpuopuiu.eablkybsjg(this.buttonText, button.buttonText) && this.action == button.action;
        }

        public int hashCode() {
            return (this.buttonText.hashCode() * 31) + this.action.hashCode();
        }

        /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        public String toString() {
            return "Button(buttonText=" + this.buttonText + ", action=" + this.action + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.buttonText);
            dest.writeString(this.action.name());
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final iobyxmoadg getAction() {
            return this.action;
        }
    }

    public enum iobyxmoadg {
        CLEAR_CART;


        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f92955jyumaefscl = zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public CartHeaderUiModel(String text, Button button) {
        zdlpuopuiu.btonecajqb(text, "text");
        this.f92951iobyxmoadg = text;
        this.f92952zoijcleaow = button;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartHeaderUiModel)) {
            return false;
        }
        CartHeaderUiModel cartHeaderUiModel = (CartHeaderUiModel) obj;
        return zdlpuopuiu.eablkybsjg(this.f92951iobyxmoadg, cartHeaderUiModel.f92951iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92952zoijcleaow, cartHeaderUiModel.f92952zoijcleaow);
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return this.f92951iobyxmoadg;
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.HEADER;
    }

    public int hashCode() {
        int iHashCode = this.f92951iobyxmoadg.hashCode() * 31;
        Button button = this.f92952zoijcleaow;
        return iHashCode + (button == null ? 0 : button.hashCode());
    }

    public final Button iobyxmoadg() {
        return this.f92952zoijcleaow;
    }

    public String toString() {
        return "CartHeaderUiModel(text=" + this.f92951iobyxmoadg + ", button=" + this.f92952zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f92951iobyxmoadg;
    }

    public /* synthetic */ CartHeaderUiModel(String str, Button button, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : button);
    }
}
