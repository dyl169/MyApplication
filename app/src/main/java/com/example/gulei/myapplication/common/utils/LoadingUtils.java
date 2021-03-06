package com.example.gulei.myapplication.common.utils;

import android.content.Context;

import com.example.gulei.myapplication.ui.view.dialog.LoadingDialog;


/**
 * Created by hank on 2015/7/22.
 */
public class LoadingUtils {
   
   private LoadingDialog loadingDialog;
   private Context context;
   private boolean isShow = true;

   public LoadingUtils(Context context, boolean isShow) {
      this.context = context;
      this.isShow = isShow;
   }


   public void showLoading() {
      if (loadingDialog == null) {
         loadingDialog = new LoadingDialog(context, isShow);
      }
      if (!loadingDialog.isShowing()) {
         loadingDialog.show();
      }
   }

   public void dismissLoading() {
      if (loadingDialog != null && loadingDialog.isShowing()) {
         loadingDialog.dismiss();
      }
   }
}
