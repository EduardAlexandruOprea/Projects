namespace Proiect
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tId1 = new System.Windows.Forms.TextBox();
            this.tPret1 = new System.Windows.Forms.TextBox();
            this.tAroma1 = new System.Windows.Forms.TextBox();
            this.tNume1 = new System.Windows.Forms.TextBox();
            this.tStoc1 = new System.Windows.Forms.TextBox();
            this.tId = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.tAroma = new System.Windows.Forms.Label();
            this.tPret = new System.Windows.Forms.Label();
            this.tStoc = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // tId1
            // 
            this.tId1.Location = new System.Drawing.Point(15, 89);
            this.tId1.Name = "tId1";
            this.tId1.Size = new System.Drawing.Size(295, 22);
            this.tId1.TabIndex = 0;
            this.tId1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // tPret1
            // 
            this.tPret1.Location = new System.Drawing.Point(12, 223);
            this.tPret1.Name = "tPret1";
            this.tPret1.Size = new System.Drawing.Size(295, 22);
            this.tPret1.TabIndex = 3;
            // 
            // tAroma1
            // 
            this.tAroma1.Location = new System.Drawing.Point(12, 179);
            this.tAroma1.Name = "tAroma1";
            this.tAroma1.Size = new System.Drawing.Size(295, 22);
            this.tAroma1.TabIndex = 4;
            // 
            // tNume1
            // 
            this.tNume1.Location = new System.Drawing.Point(12, 133);
            this.tNume1.Name = "tNume1";
            this.tNume1.Size = new System.Drawing.Size(295, 22);
            this.tNume1.TabIndex = 5;
            // 
            // tStoc1
            // 
            this.tStoc1.Location = new System.Drawing.Point(12, 267);
            this.tStoc1.Name = "tStoc1";
            this.tStoc1.Size = new System.Drawing.Size(295, 22);
            this.tStoc1.TabIndex = 6;
            this.tStoc1.TextChanged += new System.EventHandler(this.textBox7_TextChanged);
            // 
            // tId
            // 
            this.tId.AutoSize = true;
            this.tId.Location = new System.Drawing.Point(12, 70);
            this.tId.Name = "tId";
            this.tId.Size = new System.Drawing.Size(79, 16);
            this.tId.TabIndex = 7;
            this.tId.Text = "ID lumanare";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 114);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(102, 16);
            this.label2.TabIndex = 8;
            this.label2.Text = "Nume lumanare";
            // 
            // tAroma
            // 
            this.tAroma.AutoSize = true;
            this.tAroma.Location = new System.Drawing.Point(12, 160);
            this.tAroma.Name = "tAroma";
            this.tAroma.Size = new System.Drawing.Size(47, 16);
            this.tAroma.TabIndex = 9;
            this.tAroma.Text = "Aroma";
            this.tAroma.Click += new System.EventHandler(this.label3_Click);
            // 
            // tPret
            // 
            this.tPret.AutoSize = true;
            this.tPret.Location = new System.Drawing.Point(15, 204);
            this.tPret.Name = "tPret";
            this.tPret.Size = new System.Drawing.Size(31, 16);
            this.tPret.TabIndex = 10;
            this.tPret.Text = "Pret";
            // 
            // tStoc
            // 
            this.tStoc.AutoSize = true;
            this.tStoc.Location = new System.Drawing.Point(15, 248);
            this.tStoc.Name = "tStoc";
            this.tStoc.Size = new System.Drawing.Size(34, 16);
            this.tStoc.TabIndex = 11;
            this.tStoc.Text = "Stoc";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(12, 323);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(92, 28);
            this.button1.TabIndex = 12;
            this.button1.Text = "Salvare";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(215, 323);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(92, 28);
            this.button3.TabIndex = 14;
            this.button3.Text = "Inapoi";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(320, 375);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.tStoc);
            this.Controls.Add(this.tPret);
            this.Controls.Add(this.tAroma);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.tId);
            this.Controls.Add(this.tStoc1);
            this.Controls.Add(this.tNume1);
            this.Controls.Add(this.tAroma1);
            this.Controls.Add(this.tPret1);
            this.Controls.Add(this.tId1);
            this.Name = "Form2";
            this.Text = "Form2";
            this.Load += new System.EventHandler(this.Form2_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox tId1;
        private System.Windows.Forms.TextBox tPret1;
        private System.Windows.Forms.TextBox tAroma1;
        private System.Windows.Forms.TextBox tNume1;
        private System.Windows.Forms.TextBox tStoc1;
        private System.Windows.Forms.Label tId;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label tAroma;
        private System.Windows.Forms.Label tPret;
        private System.Windows.Forms.Label tStoc;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button3;
    }
}