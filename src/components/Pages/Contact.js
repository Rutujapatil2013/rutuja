import React from 'react';
import Header from '../Header';
import Footer from '../Footer';
import "./Contact.css"

const Contact = () => {
  return (
    <>
      <Header/>
      <div className='container'>
        <h2 className='contact_text'>Contact US</h2>
        
        <iframe className='map' src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3782.0376535842215!2d73.77074739999996!3d18.572341100000006!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2b9567ef5fe5d%3A0x1cf9fb91eaeb2b14!2sALTUS!5e0!3m2!1sen!2sin!4v1680158700162!5m2!1sen!2sin" width="100%" height="450" style={{border:0}} allowFullScreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>

        <div className='form-container'>
          <form action="#" method='POST'>
            <input type="text" 
              name='Username'
              placeholder='username'
              autoComplete='off'
              required
            />

            <input type="text" 
              name='Email'
              placeholder='email'
              autocomplete='off'
              required
            />

            <textarea
              name="Your message" 
              placeholder='Type here'  
              cols="50" 
              rows="10"
              autocomplete='off'
              required>
            </textarea>

            <input type="submit" value='Submit'/>

          </form>
        </div>

      </div>
      <Footer/>
    </>
  )
}

export default Contact;
