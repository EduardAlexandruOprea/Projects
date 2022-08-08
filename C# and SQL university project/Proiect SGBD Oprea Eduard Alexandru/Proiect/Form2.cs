using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Proiect
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form2_Load(object sender, EventArgs e)
        {
            tId1.Text = Meniu.id.ToString();
            tNume1.Text = Meniu.nume;
            tAroma1.Text = Meniu.aroma;
            tPret1.Text =Meniu.pret.ToString();
            tStoc1.Text = Meniu.stoc.ToString();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            if (string.IsNullOrEmpty(tId.Text))
            {
                MessageBox.Show("Vă rugăm introduceți ID-ul lumanarii!");
                return;
            }
            if (string.IsNullOrEmpty(tNume1.Text))
            {
                MessageBox.Show("Vă rugăm introduceti numele!");
                return;
            }
            if (string.IsNullOrEmpty(tAroma.Text))
            {
                MessageBox.Show("Vă rugăm introduceti aroma!");
                return;
            }
            if (string.IsNullOrEmpty(tStoc.Text))
            {
                MessageBox.Show("Vă rugăm introduceți stocul!");
                return;
            }


            if (Meniu.okAd == false)
            {

                string insert = "insert into Lumanari(id_lumanare,nume_lumanare ,aroma_lumanare,pret_lumanare ,stoc_lumanare ) values (" + int.Parse(tId1.Text) + ",'" + tNume1.Text + "','" + tAroma1.Text + "'," + int.Parse(tPret1.Text) + "," + int.Parse(tStoc1.Text) + ")";
                try
                {
                    Global.con.Open();
                    SqlCommand cmd = new SqlCommand(insert, Global.con);
                    cmd.ExecuteNonQuery();
                    Global.con.Close();
                    MessageBox.Show("Lumanarea a fost adăugata cu succes!");

                }
                catch (ArgumentException x)
                { MessageBox.Show(x.ToString()); }
               
            }
            else
            {

                string insert = "UPDATE Lumanari set id_lumanare='" + int.Parse(tId1.Text) + "', nume_lumanare='" + tNume1.Text + "',aroma_lumanare= '" + tAroma1.Text + "',pret_lumanare='" + int.Parse(tPret1.Text) + "',stoc_lumanare='" + int.Parse(tStoc1.Text) + "' WHERE id_lumanare= '" + Meniu.id+ "'";
                Global.con.Open();
                SqlCommand cmd = new SqlCommand(insert, Global.con);
                cmd.ExecuteNonQuery();
                Global.con.Close();
                MessageBox.Show("Lumanarea a fost modificata cu succes!");
                
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Meniu f1 = new Meniu();
            f1.ShowDialog();
            this.Visible=false;
            
        }
    }
}
