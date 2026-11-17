package modern.payments.ecomAndroid.util.holder;

import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "", "Resource", "Text", "Lmodern/payments/ecomAndroid/util/holder/StringHolder$Resource;", "Lmodern/payments/ecomAndroid/util/holder/StringHolder$Text;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StringHolder {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/util/holder/StringHolder$Text;", "Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "text", "", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Text implements StringHolder {
        private final CharSequence text;

        public Text(CharSequence text) {
            zdlpuopuiu.btonecajqb(text, "text");
            this.text = text;
        }

        public static /* synthetic */ Text copy$default(Text text, CharSequence charSequence, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                charSequence = text.text;
            }
            return text.copy(charSequence);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        public final Text copy(CharSequence text) {
            zdlpuopuiu.btonecajqb(text, "text");
            return new Text(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && zdlpuopuiu.eablkybsjg(this.text, ((Text) other).text);
        }

        public final CharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Text(text=" + ((Object) this.text) + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/util/holder/StringHolder$Resource;", "Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "resId", "", "args", "", "", "(ILjava/util/List;)V", "getArgs", "()Ljava/util/List;", "getResId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Resource implements StringHolder {
        private final List<Object> args;
        private final int resId;

        public Resource(int i13, List<? extends Object> args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.resId = i13;
            this.args = args;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resource copy$default(Resource resource, int i13, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = resource.resId;
            }
            if ((i14 & 2) != 0) {
                list = resource.args;
            }
            return resource.copy(i13, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        public final List<Object> component2() {
            return this.args;
        }

        public final Resource copy(int resId, List<? extends Object> args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return new Resource(resId, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) other;
            return this.resId == resource.resId && zdlpuopuiu.eablkybsjg(this.args, resource.args);
        }

        public final List<Object> getArgs() {
            return this.args;
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.resId) * 31) + this.args.hashCode();
        }

        public String toString() {
            return "Resource(resId=" + this.resId + ", args=" + this.args + ')';
        }

        public /* synthetic */ Resource(int i13, List list, int i14, gtknphoqwx gtknphoqwxVar) {
            this(i13, (i14 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list);
        }
    }
}
