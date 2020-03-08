package com.geovanedsilveira.netflixremake.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.geovanedsilveira.netflixremake.model.Category;

import java.util.List;

public class JsonDownloadTask extends AsyncTask<String, Void, List<Category>> {

    private final Context context;
    ProgressDialog dialog;

    public JsonDownloadTask(Context context){
        this.context = context;
    }

    //main-thread
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog = ProgressDialog.show(context, "Carregando", "", true);
    }

    //thread - background
    @Override
    protected List<Category> doInBackground(String... params) {
        return null;
    }

    //main - thread
    @Override
    protected void onPostExecute(List<Category> categories) {
        super.onPostExecute(categories);
    }
}
