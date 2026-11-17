package com.yandex.runtime.image;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageProvider {
    private final boolean cacheable;

    private static abstract class ImageProviderImpl extends ImageProvider {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f25458id;

        public ImageProviderImpl(String str, boolean z13) {
            super(z13);
            this.f25458id = str;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public String getId() {
            return this.f25458id;
        }

        @Override // com.yandex.runtime.image.ImageProvider
        public Bitmap getImage() {
            return loadBitmap();
        }

        protected abstract Bitmap loadBitmap();
    }

    public ImageProvider() {
        this(true);
    }

    public static ImageProvider fromAsset(Context context, String str) {
        return fromAsset(context, str, true);
    }

    public static ImageProvider fromBitmap(Bitmap bitmap) {
        return fromBitmap(bitmap, true, "bitmap:" + UUID.randomUUID().toString());
    }

    public static ImageProvider fromFile(String str) {
        return fromFile(str, true);
    }

    public static ImageProvider fromResource(Context context, int i13) {
        return fromResource(context, i13, true);
    }

    public abstract String getId();

    public abstract Bitmap getImage();

    public boolean isCacheable() {
        return this.cacheable;
    }

    public ImageProvider(boolean z13) {
        this.cacheable = z13;
    }

    public static ImageProvider fromAsset(Context context, final String str, boolean z13) {
        final AssetManager assets = context.getAssets();
        return new ImageProviderImpl("asset:" + str, z13) { // from class: com.yandex.runtime.image.ImageProvider.2
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            protected Bitmap loadBitmap() {
                Bitmap bitmapDecodeStream = null;
                try {
                    InputStream inputStreamOpen = assets.open(str);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    } finally {
                        inputStreamOpen.close();
                    }
                } catch (IOException e13) {
                    Log.e("yandex.maps", "Can't load image from asset: " + str, e13);
                }
                return bitmapDecodeStream;
            }
        };
    }

    public static ImageProvider fromBitmap(final Bitmap bitmap, boolean z13, final String str) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return new ImageProvider(z13) { // from class: com.yandex.runtime.image.ImageProvider.1
                @Override // com.yandex.runtime.image.ImageProvider
                public String getId() {
                    return str;
                }

                @Override // com.yandex.runtime.image.ImageProvider
                public Bitmap getImage() {
                    return bitmap;
                }
            };
        }
        throw new IllegalArgumentException("Bitmap config value should be ARGB_8888");
    }

    public static ImageProvider fromFile(final String str, boolean z13) {
        return new ImageProviderImpl("file:" + str, z13) { // from class: com.yandex.runtime.image.ImageProvider.4
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            protected Bitmap loadBitmap() {
                return BitmapFactory.decodeFile(str);
            }
        };
    }

    public static ImageProvider fromResource(Context context, final int i13, boolean z13) {
        final Resources resources = context.getResources();
        return new ImageProviderImpl("resource:" + i13, z13) { // from class: com.yandex.runtime.image.ImageProvider.3
            @Override // com.yandex.runtime.image.ImageProvider.ImageProviderImpl
            protected Bitmap loadBitmap() {
                return BitmapFactory.decodeResource(resources, i13);
            }
        };
    }
}
